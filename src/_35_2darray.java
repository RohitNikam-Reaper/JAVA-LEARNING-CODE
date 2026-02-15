import java.util.SplittableRandom;

public class _35_2darray {
    public static void main(String[] agrs) {
        // this is a 1d array
        String[] fruits = {"apple", "orange", "banana"};
        String[] veg = {"potato", "onion", "carrot"};
        String[] meat = {"chicken", "pork", "beef", "fish"};

        String[][] grocies = {fruits, veg, meat};

        for (String[] foods : grocies) {
            System.out.println(foods);
        }
        // we will get memory address
        for (String[] foodsss : grocies) {
            for (String foodes : foodsss) {

                System.out.print(foodes + " ");
            }
            System.out.println();
        }
        grocies[1][1] = "ladyfinger";
        for (String[] foodsss : grocies) {
            for (String foodes : foodsss) {

                System.out.print(foodes + " ");
            }
            System.out.println();
        }
        char[][] telephone = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}};
        for (char[] numpad : telephone) {
            for (char numpad2 : numpad) {
                System.out.print(numpad2 + " ");
            }
            System.out.println();
        }
    }
}
