import java.util.Scanner;
public class _21_whileloop {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String name= "";
            while (name.isEmpty()){
                System.out.print("ENTER YOUR NAME:- ");
                name = scanner.nextLine();
            }
            System.out.println("HELLO " + name);
            String response = "";
            while (!response.equals("Q")){
                System.out.println("you are playing a game");
                System.out.println("press Q to quit");
                response = scanner.next().toUpperCase();

            }
            System.out.println("you have quit the game");
            int age=0;
            System.out.println("ENTER YOUR AGE");
            age=scanner.nextInt();

            while (age<0){
                System.out.println("your age is not valid are you dumb :<X");
                System.out.println("ENTER YOUR AGE");
                age = scanner.nextInt();
            }
            System.out.println("You are " + age + "yrs old");


            int num = 0;
            do{
                System.out.print("enter the number between 1-10:- ");
                num= scanner.nextInt();
            }while( num<1 || num>10);
            System.out.println("you picked the number:- " + num);

            scanner.close();
        }
    }

