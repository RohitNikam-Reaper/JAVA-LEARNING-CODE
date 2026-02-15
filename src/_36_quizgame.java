import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SplittableRandom;

public class _36_quizgame {
    public static void main(String[] agrs){
        // java quiz game
        String[] question = {"WHO IS THE SMARTEST PLAYER OF ALL OF MINECRAFT?",
                            "WHO IS THE KINGS ARC ANTOGONIST?",
                            "IN MAFIA ARC WHO IS THE LEADER OF INVIS MAFIA? ",
                            "BIGGEST BIRD IN ALL OF MINECRAFT?",
                            "WHO IS THE PERSON WHO OUTSMARTED PARROT ?"};
        String[][] options = {{"1. WIFIES","2. PARROT","3. WEEMBU","4. SPOKE"},
                              {"1. lettuceK","2. Ashswag","3. Flamwe","4. ClownPierce"},
                              {"1. Spoke","2. JumperWho","3.Eggchan","4. AshSwag"},
                              {"1. SB737","2. Theobaldthebird","3. Parrot","4. Woogie"},
                              {"1. wifies","2. weembu","3. spoke","4. doctor4t",}};
        int[] answers = {2,1,4,3,1 };
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);


        // options array[][]
        // declare variable
        // welcome message
        // question{loop}
        // options
        //get guess from user
        // check out guess
        // display final score

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        for (int i=0; i <question.length;i++) {
            System.out.println(question[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("ENTER YOUR GUESS: ");
            guess = scanner.nextInt();
            if(guess== answers[i])  {
                System.out.println("xxxxxxxx");
                System.out.println("CORRECT");
                System.out.println("xxxxxxxx");
                score++;
        }
            else{
                System.out.println("xxxxxxxx");
                System.out.println("WRONG");
                System.out.println("xxxxxxxx");
            }

        }
        System.out.println("YOUR FINAL SCORE IS :- " + score + " out of " + question.length );
        scanner.close();
    }
}
