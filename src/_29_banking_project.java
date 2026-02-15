import java.util.Scanner;

public class _29_banking_project {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        double balance =0;

        boolean isrunning = true;

        while (isrunning) {

            System.out.println("*********---BANKING PROGRAM----**********");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            System.out.println("*********---BANKING PROGRAM----**********");
            System.out.print("ENTER YOUR CHOICE (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showbalance(balance);
                case 2 -> balance +=deposit();
                case 3 -> balance -=withdraw(balance);
                case 4 -> isrunning = false;
                default -> System.out.println("INVALID CHOICE");

            }
        }
        scanner.close();
    }
    static  void showbalance(double balance){
        System.out.printf(" $%.3f\n",balance);
    }
    static  double deposit() {
        double AMOUNT;
        System.out.print("enter the amount to be deposited:- ");
        AMOUNT = scanner.nextDouble();
        if (AMOUNT < 0) {
            System.out.println("amount can't be negative");
            return 0;
        }
        else {
            return AMOUNT;
        }

    }
    static double withdraw(double balance) {
        double withdraw;
        System.out.print("enter the amount to be withdraw:- ");
        withdraw = scanner.nextDouble();
        if (balance < withdraw) {
            System.out.println("INSUFFICIENT BALANCE");
            return 0;
        } else if (withdraw < 0) {
            System.out.println("can't be negative");
            return 0;

        } else {
            return withdraw;

        }

    }

}

// writing part what to write
//choice choose
//switch case use for the input of 1 2 3 4 as the output to give
// method make