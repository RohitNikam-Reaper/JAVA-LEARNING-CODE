

public class _47_tostring {
    public static void main(String[] args) {
        // .tostring = method inherited from an object class
        // used to return a string representation  of an object
        // be default it returns a hash code as a unique identifier
        // it can be overrided  to provide meaning ful  details

        _47_car car1 = new _47_car("ferrari", "LA", 2025, "blue");
        _47_car car2 = new _47_car("BMW", "M4", 2023, "Black");
        _47_car car3 = new _47_car("ROLLS ROYALS", "CLASSIC", 2024, "WHITE");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }
}
