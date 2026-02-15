import java.util.Scanner;
public class _20_logics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp = 10;
        boolean sunnyDay = true;

        // AND (&&)
        if (temp > 0 && temp < 30) {
            System.out.println("Temperature is normal");
        }

        // OR (||)
        if (temp <= 0 || temp >= 40) {
            System.out.println("Extreme weather");
        }

        // NOT (!)
        if (!sunnyDay) {
            System.out.println("It is not sunny today");
        } else {
            System.out.println("It is sunny today");
        }

        String username;
        System.out.print("enter the username:- ");
        username = scanner.nextLine();

        if(username.length()>12 || username.length()<4 ) {

            System.out.println("username must be between 4-12 character :X :X ");
        }

        else if(username.contains(" ") || username.contains("_")){
            System.out.println("username can't contain spaces and underscores :X :X");

        }

        else{
            System.out.println("WELCOME" + username);
        }
        scanner.close();
    }
}
