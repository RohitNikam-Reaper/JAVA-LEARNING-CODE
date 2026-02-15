import java.util.Random;
import java.util.Scanner;

public class _39_oops {

    public static void main(){

        // OBJECT = an entity that holds data (attributes)
        //          and can perform actions (methods)
        //          it is a refrence data type
        // we store the data for an OBJECT in an location known as HEAP

        // WE NEED A CLASS FOR AN OBJECT
        // CLASS IS A BLUEPRINT TO CREATE OBJECT

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // these two are object scanner and random

        _39_car car = new _39_car();
        car.running = true;
        System.out.println(car); // gives memory address
        System.out.println(car.make); // to access attributes
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.running);


        System.out.println(car.running);
        car.start();
        System.out.println(car.running);
        car.drive();
        car.brake();
        car.stop();
        System.out.println(car.running);

        _39_car car2 = new _39_car();
        System.out.println(car.make + " "+ car.model);
        System.out.println(car2.make+ " "+ car2.model); // both are same it good we can seperate it so diffrent models
        // we are gonna learn constructor soon
        // by passing argument we can create unique opjects
    }
}
