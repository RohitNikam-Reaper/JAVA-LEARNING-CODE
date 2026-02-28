public class _47_car {
    String make;
    String model;
    int year;
    String colour;

    _47_car(String make,String model,int year, String colour){

        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;

    }

    @Override
    public String toString() {
        return  this.make + " "+ this.model +" " + this.colour+ this.year;
    }
    }
