import java.util.Scanner;

public class _7if_condn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        String name = scanner.nextLine();
        System.out.print("WHAT IS YOUR AGE : ");
        int age = scanner.nextInt();
        System.out.print("ARE YOU A STUDENT (TRUE/FALSE): ");
        boolean student = scanner.nextBoolean();


        if (name.isEmpty()) {
            System.out.println("NAME CAN'T BE EMPTY");
        } else {
            System.out.println("HELLO " + name + " !");
        }

        if (age < 18 && age >= 1) {
            System.out.println("you are not eligible to vote ");
        } else if (age >= 18) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("invalid age");
        }

        if (student) {
            System.out.println("YOU ARE A STUDENT !!!");
        } else {
            System.out.println("YOU ARE NOT A STUDENT !!!");
        }
    }
}
