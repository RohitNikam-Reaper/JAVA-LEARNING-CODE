import java.util.Scanner;

public class _3user_input {

       public static void main(String[] args){

           Scanner scanner = new Scanner(System.in);

           System.out.print("ENTER YOUR NAME : "); // using print to get the input in same line
           String name= scanner.nextLine(); // read the input with spaces
           //String name2= scanner.next(); // not gonna read it only read ther 1st part use next
           System.out.println("HELLO " + name);

           System.out.print("ENTER YOUR AGE: ");
           int age= scanner.nextInt(); //nextint() use for this
           System.out.println("YOUE AGE IS " + age);

           System.out.print("ENTER YOUR GPA: ");
           Double gpa=scanner.nextDouble();
           System.out.println("YOUR GPA IS: " + gpa);

           System.out.print("ARE YOU A STUDENT (True/False): ");
           Boolean isStudent= scanner.nextBoolean();
           System.out.println("STUDENT: " +  isStudent);

           if(isStudent){
               System.out.println("STUDENT IS ALIVE !");
           }
           else{
               System.out.println("STUDENT IS DEAD ! \uD83D\uDC80 ");
           }
           scanner.close();


    }
}
