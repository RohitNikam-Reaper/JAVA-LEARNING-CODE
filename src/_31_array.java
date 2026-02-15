import java.util.Arrays;
import java.util.Scanner;

public class _31_array {
    public static void main(String[] agrs) {
        String[] fruits = {"apple", "orange", "banana", "mango"};
        System.out.println(fruits);
        System.out.println(fruits[0]);
        fruits[2] = "peach";
        System.out.println(fruits[2]);

        int numoffruits = fruits.length;
        for(int i=0;i<fruits.length;i++){
            System.out.print(fruits[i] + " ");

        }
        System.out.println("\n");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        Arrays.sort(fruits);
        System.out.println("\n");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        Arrays.fill(fruits,"pineaaple");
        System.out.println("\n");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}