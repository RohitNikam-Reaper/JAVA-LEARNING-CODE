public class _48_Abstarction {
    public static void main(String[] args) {


        // ABSTARCTION :- used to define abstract class and methodd
        // ABSTRACT CLASS IS A PROCESS OF  HIDING IMPLEMENTATION DETAILS AND SHOWING ONLY THE ESSETIAL DETAILS
        // ABSTACT CLASS CAN'T BE INTIATED DIRECTLY
        // can contain 'abstact' methods (which must be implemented)
        // can contain 'concrete' method (which are inherited)

        _48_circle circle = new _48_circle(0.5);
        _48_traingle traingle = new _48_traingle(6,8);


        System.out.println(circle.area());
        circle.display();
        System.out.println(traingle.area());
        traingle.display();
    }
}