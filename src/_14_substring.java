import java.util.Scanner;
public class _14_substring {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        // SUBSTRING :- METHOD USED TO EXTRACT A PORTION OF THE STRING

        String email ="abc123@gmail.com";
        String username = email.substring(0,6);
        String domain = email.substring(7); // you don't need the ending index if you want to print all after that
        System.out.println(username);
        System.out.println(domain);

        // to make this flexible so if email changes i still got the result

        System.out.print("ENTER THE EMAIL:-");
        String email2= scanner.nextLine();

        if(email2.contains("@")){
            System.out.println("your email is valid");
            String username2= email2.substring(0,email2.indexOf("@"));
            System.out.println(username2);
            String domain2= email2.substring(email2.indexOf("@") + 1); // we need aftrer the @sign
            System.out.println(domain2);
        }
        else {
            System.out.println("your email is not valid need to contain @ ");
        }
    }

}
