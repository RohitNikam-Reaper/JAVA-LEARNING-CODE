import java.util.ArrayList;
import java.util.Scanner;

public class _56_exerciseof_arraylist {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numoffood = scanner.nextInt();
        scanner.nextLine();

        for (int i =1; i<=numoffood;i++){
            System.out.print("Enter food " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);

        }
        System.out.println(foods);


        scanner.close();
    }
}
