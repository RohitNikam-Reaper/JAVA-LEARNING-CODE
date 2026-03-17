public class _54_composition {

    public static void main(String[] agrs){
        //COMPOSITION :- represent a part of relationship between objects
        //              FOR EXAMPLE :- a engine is a "part of" a car
        //              ALLOW COMPLEX OBJECT TO BE CONSTRUCTED FROM SMALLER OBJECTS.

        _54_car car  = new _54_car("BMW",2025,"v8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine);
        System.out.println(car.engine.type);

        car.start();

        // difference with aggregation is that if we delete car object engine is gone too but in agreegation
        // if we delete the library the book is still there opposite of that;
    }
}
