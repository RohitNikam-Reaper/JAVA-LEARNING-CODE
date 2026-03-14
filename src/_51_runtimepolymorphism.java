import java.util.Scanner;

public class _51_runtimepolymorphism {
    public static void main(String[] agrs){

        // runtime polymorphism = when the method gets executed is decided at runtime based on the actual type of an
        //object.

        // here we cannot create a animal object

        Scanner scanner = new Scanner(System.in);

        _51_animal animal; // declare the object
        System.out.print("WOULD YOU LIKE A DOG OR A CAT(1 for dog 2 for cat):- ");
        int choice = scanner.nextInt();

        if(choice==1){
            animal = new _51_dog();
            animal.speak();              // object maken and runtime work
        }
        else if (choice==2) {
            animal = new _51_cat();
            animal.speak();
        }
        else{
            System.out.println("your choice is not available");
        }

        scanner.close();

    }



}
