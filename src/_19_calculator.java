import java.util.Scanner;

public class _19_calculator {
    public static void main(String[] args) {

        double result = 0;
        boolean validopreation = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER THE FIRST NUMBER:- ");
        double num1 = scanner.nextDouble();

        System.out.print("ENTER THE OPERATION TO PERFORM:- (+,-,/,*,^):- ");
        char operator = scanner.next().charAt(0);

        System.out.print("ENTER THE SECOND NUMBER:- ");
        double num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);

            case '/' -> {
                if (num2 == 0) {
                    System.out.println("CANNOT DIVIDE BY ZERO");
                    validopreation = false;
                } else {
                    result = num1 / num2;
                }
            }

            default -> {
                System.out.println("INVALID OPERATOR");
                validopreation = false;
            }
        }

        // print result only if operation is valid
        if (validopreation) {
            System.out.println("RESULT = " + result);
        }

        scanner.close();
    }
}
