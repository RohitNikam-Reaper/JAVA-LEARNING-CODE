public class _54_car {
    String model;
    int year;
    _54_engine engine;

    _54_car(String model,int year, String enginetype){
        this.model = model;
        this.year = year;
        this.engine = new _54_engine(enginetype);


    }
    void start(){
        this.engine.start();
        System.out.println("the " + this.model+" is running");
    }
}
