import java.util.Random;
import java.util.Scanner;

public class _22_numberguessinggame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int randomnumber = random.nextInt(min, max + 1);
        int guessno = 0;
        int attempts = 0;

        System.out.println("_____NUMBER GUESSING GAME______");
        System.out.printf("ENTER THE NUMBER BETWEEN %d-%d \n", min,max);

        do {
            System.out.print("ENTER YOUR GUESS:- ");

            // 🔴 INPUT VALIDATION
            if (!scanner.hasNextInt()) {
                System.out.println("WRONG INPUT. ENTER ONLY NUMBERS.");
                scanner.next(); // clear wrong input
                continue;
            }

            guessno = scanner.nextInt();
            attempts++;

            if (guessno < min || guessno > max) {
                System.out.println("NUMBER OUT OF RANGE. TRY AGAIN.");
            } else if (guessno < randomnumber) {
                System.out.println("TOO LOW");
            } else if (guessno > randomnumber) {
                System.out.println("TOO HIGH");
            } else {
                System.out.println("YOU HAVE WON");
                System.out.println("CORRECT NUMBER IS :- " + randomnumber);
                System.out.println("ATTEMPTS TAKEN :- " + attempts);
            }

        } while (guessno != randomnumber);

        scanner.close();
    }
}
