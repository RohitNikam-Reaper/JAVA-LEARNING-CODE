import java.util.Random;
public class _8_randomnumbers {
    public static void  main(String[] args){

        Random random = new Random();
        System.out.println(" for 1 dice");

        int number = random.nextInt(1,7); // from where to where random
        System.out.println(number);

        // die roll 1 to 6

        System.out.println("for 3 dice");
        int number1 = random.nextInt(1,7); // from where to where random
        System.out.println(number1);
        int number2 = random.nextInt(1,7); // from where to where random
        System.out.println(number2);
        int number3 = random.nextInt(1,7); // from where to where random
        System.out.println(number3);

        // YOU CAN ALSO GENERATE THE DOUBLE TO

        // FOR COIN FLIP (BOOLEAN THING)

        boolean COIN = random.nextBoolean();
        System.out.println("IS IT HEAD CHECKING");
        System.out.println(COIN);
    }
}
