public class _50_polymorphism {

    public static void main(String[] args){

        // POLYMORPHISM :- poly -> many & morph :- shape
        // object can identify as other object
        // object can be treated as object of  a common superclass

        // polymorphism also achived by interface
        // make vehicle interface use implements to link
        // public void go()

        _50_car car = new _50_car();
        _50_bike bike = new _50_bike();
        _50_truck truck = new _50_truck();

        car.go();
        bike.go();
        truck.go();

        // we would like to have arrays
        // _50_car[] cars = {car,bike,truck} here bike and truck is wrong because they can't converted into car;
        // same goes with bike and truck so we use vehical becuase all of them considered as vehicles


        _50_vehicle[]  vehicles = {car , bike , truck};

        for(_50_vehicle vehicle : vehicles){

            vehicle.go();

        }
    }

}
