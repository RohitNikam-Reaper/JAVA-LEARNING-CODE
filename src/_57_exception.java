import java.util.InputMismatchException;
import java.util.Scanner;

public class _57_exception {
    public static void main() {


        // EXCEPTION =  an event that inturrupts the normal flow of the program
        // (divided by zero,file not found,mismatch input type)
        // surround any dangerous code with a try{} block

        // try{} catch{} finally{}

        try (Scanner scanner = new Scanner(System.in)) { // there is try with resources where a file open can close at end {scanner}
            try {
                System.out.println(1 / 0);
                // this is an exception and now (we catch this and write that for this expection give this output)
            } catch (ArithmeticException divisble) {
                System.out.println("YOU Can't divide it wih zero");
            }
            System.out.print("enter the number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException otherthanint) {
            System.out.println("not a integer!!!");

        } catch (Exception e) { // for all exception if you don't know

            // SAFETY NET
            System.out.println("something went wrong");
        } finally {
            System.out.println("did you learn anything");
            // BECAUSE IT CAN ALWAYS EXECUTE
        }

    }




}
