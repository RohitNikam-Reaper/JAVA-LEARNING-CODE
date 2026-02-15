import java.util.Scanner;

public class _3user_input_learn {

    public static void main(String[] args){

        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age= scanner.nextInt();
        scanner.nextLine(); // #1 input buffer fixation stuff
        System.out.println("your age is " + age);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("YOUR NAME IS  " + name);

        scanner.close();
        // now this will not gonna let you write the age because of of the 1st input being integer and other string
        // it will take enter after 1st input as a 2nd input so to fix this \n new line thing
        // we written this #1



}
}