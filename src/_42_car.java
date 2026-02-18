public class _42_car {

    String model;
    String color;

    _42_car(String model,String color){
        this.model = model;
        this.color = color;

    }
    void drive(){
        System.out.println("YOU DRIVE THE " + this.color + " "+ this.model);
    }
}
