import java.util.Random;
import java.util.Scanner;

public class _38_slotmachinegame {
    public static void main(String[] args) {

        // JAVA SLOT MACHINE

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playagain;

        // header
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("WELCOME TO JAVA SLOTS");
        System.out.println("Symbols:- 🍋 🍌 🌽 🍗 🍛");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        // play while balance > 0
        while (balance > 0) {

            // show balance
            System.out.println("CURRENT BALANCE:- $ " + balance);

            // place bet
            System.out.print("PLACE YOUR BET AMOUNT:- ");
            bet = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            // validate bet
            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("BET MUST BE GREATER THAN 0");
                continue;
            }

            // subtract bet
            balance -= bet;

            // spin
            System.out.println("SPINNING.........");
            row = spinrow();
            printrow(row);

            // payout
            payout = getpayout(row, bet);

            if (payout > 0) {
                System.out.println("YOU WON $" + payout);
                balance += payout;
            } else {
                System.out.println("SORRY YOU LOST THE ROUND AND THE MONEY");
            }

            // play again
            System.out.print("DO YOU WANT TO PLAY AGAIN (Y/N):- ");
            playagain = scanner.nextLine().toUpperCase();

            if (!playagain.equals("Y")) {
                break;
            }
        }

        // game over
        System.out.println("THANK YOU FOR PLAYING");
        System.out.println("GAME OVER! YOUR FINAL BALANCE IS :- $ " + balance);

        scanner.close();
    }

    // spin row
    static String[] spinrow() {
        String[] symbols = {"🍋", "🍌", "🌽", "🍗", "🍛"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    // print row
    static void printrow(String[] row) {
        System.out.println("***************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***************");
    }

    // payout logic
    static int getpayout(String[] row, int bet) {

        // 3 symbols match
        if (row[0].equals(row[1]) && row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍋" -> bet * 5;
                case "🍌" -> bet * 10;
                case "🌽" -> bet * 15;
                case "🍗" -> bet * 20;
                case "🍛" -> bet * 30;
                default -> 0;
            };
        }

        // any 2 symbols match
        String matchedSymbol = null;

        if (row[0].equals(row[1]) || row[0].equals(row[2])) {
            matchedSymbol = row[0];
        } else if (row[1].equals(row[2])) {
            matchedSymbol = row[1];
        }

        if (matchedSymbol != null) {
            return switch (matchedSymbol) {
                case "🍋" -> bet * 4;
                case "🍌" -> bet * 9;
                case "🌽" -> bet * 14;
                case "🍗" -> bet * 19;
                case "🍛" -> bet * 24;
                default -> 0;
            };
        }

        return 0;
    }
}
