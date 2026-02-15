import java.util.Arrays;
import java.util.Scanner;

public class _32_userinputarray {
    public static void  main(String[] agrs) {
        Scanner  scanner = new Scanner(System.in);
        //String[] food = new String[3]; // size of the array
        String[] food;
        System.out.print("ENTER THE NO OF FOOD YOU WANT:- ");
        int size= scanner.nextInt();
        scanner.nextLine(); // input buffer
        food = new String[size];
        for (int i =0;i< food.length;i++){
            System.out.print("ENTER THE FOOD:- ");
            food[i]= scanner.nextLine();
        }
        // allocate size for the array

        for (String foods : food) {
            System.out.println(foods);
        }

        scanner.close();
    }
}
