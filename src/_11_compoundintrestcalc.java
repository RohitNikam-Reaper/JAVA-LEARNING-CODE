import java.util.Scanner;

public class _11_compoundintrestcalc {

    public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER THE PRINCIPAL AMOUNT: ");
        double principal=scanner.nextDouble();
        System.out.print("ENTER THE INTEREST RATE (in %): ");
        double rate=scanner.nextDouble()/100;
        System.out.print("ENTER THE NUMBER OF TIMES COMPOUNDED PER YEAR: ");
        int timescompounded=scanner.nextInt();
        System.out.print("ENTER THE NUMBER OF YEARS: ");
        int years =scanner.nextInt();

        double amount = principal * Math.pow(1+(rate/timescompounded), timescompounded*years);

        System.out.printf("The amount after %d years is $ %.3f ",years ,amount);


        scanner.close();
    }
}
