import java.util.Scanner;

// AREA OF RECTANGLE PROGRAM
public class _03work_program {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the lenght of the rectangle (in cm) : ");
        double lenght=scanner.nextDouble();
        System.out.print("Enter the breath of the rectangle (in cm): ");
        double breath=scanner.nextDouble();

        System.out.println("Area of the rectangle is : " + (lenght*breath) + " cm²"); // for ² num pad 0N then Alt+0178

        scanner.close();
    }
}
