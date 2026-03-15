public class _52_gettersetter {
    public static void main(){
        // they help protect object data and add rules for accessing and modifying them
        // GETTERS = method makes a field readable
        // SETTERS= method that makes a filed writable




        _52_car car1 = new _52_car("BMW M4","BLACK",20000);


        System.out.println(car1.getModel() + " "+ car1.getColour() + " " + car1.getPrice());
        // here the attributes are publically accessible;
        // add private to make sure this was good + ALSO make the method for that differently getter method
        // here you need to see that
        // i can repaint and car price fluctuate so i need that these 2 things is writable setter methods

        car1.setColour("blue");
        car1.setPrice(-1000);

        System.out.println(car1.getModel() + " "+ car1.getColour() + " " + car1.getPrice());
        car1.setPrice(15000);
        System.out.println(car1.getModel() + " "+ car1.getColour() + " " + car1.getPrice());

        // also add final keyword after model so they can't change the model


    }
}
