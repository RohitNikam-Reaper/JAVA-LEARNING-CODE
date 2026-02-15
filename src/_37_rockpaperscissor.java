import java.util.Random;
import java.util.Scanner;

public class _37_rockpaperscissor {
    public static void main(String[] args){

        // variable
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissor"};
        String playerchoice;
        String comchoice;

        String playagain = "yes";

        // get choice from user
        do {
            System.out.print("ENTER YOUR MOVE (rock,paper,scissor): ");

            playerchoice = scanner.nextLine().toLowerCase();

            if (!playerchoice.equals("rock") && !playerchoice.equals("paper") && !playerchoice.equals("scissor")) {
                System.out.println("Invalid choice");
                continue;
            }

            // random choice from computer
            comchoice = choices[random.nextInt(3)];
            System.out.println("COMPUTER CHOOSE:- " + comchoice);

            // check win condition
            if (playerchoice.equals(comchoice)) {
                System.out.println("DRAW");
            } else if ((playerchoice.equals("rock") && comchoice.equals("scissor")) ||
                    (playerchoice.equals("paper") && comchoice.equals("rock")) ||
                    (playerchoice.equals("scissor") && comchoice.equals("paper"))) {
                System.out.println("YOU WON");
            } else {
                System.out.println("You Lose");
            }

            // ask to play again
            do {
                System.out.print("Play Again(yes,no) :- ");
                playagain = scanner.nextLine().toLowerCase();

                if (!playagain.equals("yes") && !playagain.equals("no")) {
                    System.out.println("INVALID {TYPE(yes/no)}");
                }

            } while (!playagain.equals("yes") && !playagain.equals("no"));

        } while (playagain.equals("yes"));

        // goodbye
        System.out.println("GOODBYE FELLOW MATE :)");

        scanner.close();
    }
}
