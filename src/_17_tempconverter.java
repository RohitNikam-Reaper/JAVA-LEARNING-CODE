import java.util.Scanner;
public class _17_tempconverter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("TEMPERATURE CONVERTER");
        System.out.println("1. FAHRENHEIT TO CELSIUS ");
        System.out.println("2. CELSIUS TO FAHRENHEIT ");
        System.out.print("CHOOSE THE OPTION:- ");

        int choice = scanner.nextInt();

        if(choice==1){

            System.out.print("ENTER THE TEMPERATURE IN FAHRENHEIT:- ");
            double tempf= scanner.nextDouble();
            double convertCELSIUS= (tempf-32)*5/9;
            System.out.printf("THE TEMPATURE IN CELSIUS IS:- %.2f°C",convertCELSIUS );

        }
        else if (choice==2) {
            System.out.print("ENTER THE TEMPERATURE IN CELSIUS:- ");
            double tempC= scanner.nextDouble();
            double convertf= (tempC*9/5)+32;
            System.out.printf("THE TEMPATURE IN FARENHIET IS:- %.2f°F",convertf );
        }
        else{
            System.out.println("wrong choice input invalid choice:-");
        }


    }
}
