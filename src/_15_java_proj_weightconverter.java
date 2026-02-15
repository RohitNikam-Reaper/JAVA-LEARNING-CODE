import java.util.Scanner;

public class _15_java_proj_weightconverter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight Converter Program");
        System.out.println("1: CONVERT LBS TO KGS");
        System.out.println("2: CONVERT KGS TO LBS");
        System.out.print("CHOOSE AN OPTION: ");
        int choice = scanner.nextInt();
        if (choice==1){
            System.out.print("ENTER WEIGHT IN LBS: ");
            double weight = scanner.nextDouble();
            double newweight= weight*0.453592;
            System.out.printf("THE NEW WEIGHT IN KGS IS: %.2f ",newweight);
        }
        else if (choice==2) {
            System.out.print("ENTER WEIGHT IN KGS: ");
            double weight = scanner.nextDouble();
            double newweight= weight*2.20462;
            System.out.printf("THE NEW WEIGHT IN LBS IS: %.2f ",newweight );

        }
        else {
            System.out.println("that is not a valid choice");
        }

        scanner.close();

    }
}
