public class _42_array_of_objects {
    public static void main(String[] agrs){

//        _42_car car1 = new _42_car("MUSTANG","BLUE");
//        _42_car car2 = new _42_car("FERRARI","RED");
//        _42_car car3 = new _42_car("LAMBO","PINK");
//        _42_car car4 = new _42_car("DODGE CHALLENGER","BLACK");
        // either do this or



        _42_car[] cars = {new _42_car("MUSTANG","RED"),new _42_car("FERRARI","RED"),
                new _42_car("LAMBO","PINK"),new _42_car("DODGE CHALLENGER","BLACK")};

        for (_42_car car : cars) {
            car.color = "black";
        }
        for (_42_car car : cars) {
            car.drive();
        }


    }
}
