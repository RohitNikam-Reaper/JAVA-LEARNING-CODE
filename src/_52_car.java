public class _52_car {

    private final String  model;
    private String colour;
    private int price;

    _52_car(String model, String colour,int price){

        this.model= model;
        this.colour= colour;
        this.price= price;

    }
    String getModel(){
           return this.model;
    }
    String getColour(){
        return this.colour;
    }
    String getPrice(){
        return "$" + this.price;

    }
    void setColour(String colour){
        this.colour=colour;

    }
    void setPrice(int price){
        if(price<0){
            System.out.println("price can't be zero");
        }
        else{
            this.price =price;
        }


    }
}
