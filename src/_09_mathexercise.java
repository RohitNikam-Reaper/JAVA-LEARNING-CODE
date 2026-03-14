import java.util.Scanner;

public class _09_mathexercise {

    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER THE VALUE OF THE PERPENDICULAR (in cm): ");
        double Perpendicular= scanner.nextDouble();
        System.out.print("ENTER THE VALUE OF THE BASE (in cm): ");
        double base= scanner.nextDouble();

        double HYPOTENUSE= Math.sqrt(Math.pow(Perpendicular,2)+ Math.pow(base,2));
        System.out.println("HYPOTENUSE:  " + HYPOTENUSE + " cm");

        System.out.print("ENTER THE RADIUS OF THE CIRCLE (in cm): ");
        double radius= scanner.nextDouble();

        double coc = 2 * Math.PI * radius;
        double area= Math.PI * Math.pow(radius,2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        System.out.printf("CIRCUMFERENCE OF CIRCLE: %.3f cm \n",coc ); // use printf for few digits to show .3f for 3 digits and use %f to show
        System.out.printf("AREA OF THE CIRCLE: %.3f cm² \n",area   );
        System.out.printf("VOLUME OF SPHERE: %.3f cm³ \n",volume ); // 0179 for superscript of 3

        scanner.close();
    }
}
