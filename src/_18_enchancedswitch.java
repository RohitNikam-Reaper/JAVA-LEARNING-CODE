import java.util.Scanner;
public class _18_enchancedswitch {

    public static void main(String[] args){
        // enchanced switches is a replacement to many else if statements
        // (java 14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("WHAT DAY IS IT:- ");
        String day = scanner.nextLine();

        switch (day){
            // REPETIVIE ONE CAN BE CONSOLOTE
            // MON TO FRI SAME OUTPUT COMES THEREFORE
            case "MONDAY","TUESDAY","WEDNESDAY" ,"THUSDAY","FRIDAY" -> System.out.println("IT IS A WORKING DAY :{");
            case "SATURDAY" -> System.out.println("IT IS WEEKAND DAY :0 ");
            case "SUNDAY" -> System.out.println("IT IS HOLIDAY :) ");
            default -> System.out.println( day + " not a week day");

        }


    }
}
