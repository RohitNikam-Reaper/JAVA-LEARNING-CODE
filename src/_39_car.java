public class _39_car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean running = false ;

// attrbutes are what written in class :- "make,model,year,price,running"

    void start(){
        running = true;
            System.out.println("you start the engine");
    }
    void stop(){
        running = false;
        System.out.println("you stopped the engine");
    }
    void drive(){
        System.out.println("you are driving the " + model);
    }

    void brake(){
        System.out.println("you brake the "+ model);
    }
}
