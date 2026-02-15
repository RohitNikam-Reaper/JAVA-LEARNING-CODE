import java.util.Random;
import java.util.Scanner;

public class _30_dicerool {
    public static void main(String[] args){

        // declare variable

        //no of dice from the user
        // check no is not zero
        // roll dices
        //get total
        // diasplay ascii art of dice

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numofdice;
        int total=0;

        System.out.print("ENTER THE NUMBER OF DICES YOU WANNA ROLL:- ");
        numofdice=scanner.nextInt();
        if (numofdice>0){
            for (int i=0;i< numofdice;i++){
                int roll = random.nextInt(1,7);
                printdie(roll);
                System.out.println("YOU ROLLED:- "+ roll);
                total+=roll;
            }
            System.out.println("TOTAL:- "+total);
        }
        else{
            System.out.println("no of dice must be greater than zero");
        }
        scanner.close();

    }

    static void printdie(int roll){
        String dice1 = """
                 _______
                |       |
                |   ■   |
                |       |
                 _______
                """;
        String dice2 = """
                 _______
                | ■     |
                |       |
                |     ■ |
                 _______
                """;
        String dice3 = """
                 _______
                | ■     |
                |   ■   |
                |     ■ |
                 _______
                """;
        String dice4 = """
                 _______
                | ■  ■ |
                |      |
                | ■  ■ |
                 _______
                """;
        String dice5 = """
                 _______
                | ■   ■ |
                |   ■   |
                | ■   ■ |
                 _______
                """;
        String dice6 = """
                 _______
                | ■   ■ |
                | ■   ■ |
                | ■   ■ |
                 _______
                """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("INVALID ROLL");

        }
    }

}
