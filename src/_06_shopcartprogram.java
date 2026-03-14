import java.util.Scanner;

public class _06_shopcartprogram {

    public static void main(String[] agrs){
        Scanner scanner= new Scanner(System.in);

        System.out.print("WHAT ITEM WOULD YOU LIKE TO BUY?: ");
        String item  = scanner.nextLine();
        System.out.print("WHAT IS THE PRICE FOR EACH? (in dollars): ");
        double price = scanner.nextDouble();
        System.out.print("HOW MANY WOULD YOU LIKE?: ");
        int quantity = scanner.nextInt();

        System.out.println("YOU HAVE BOUGHT " + quantity + " " + item +"'s");
        System.out.println("YOUR TOTAL IS " + price*quantity + " $" );
        scanner.close();
    }
}
