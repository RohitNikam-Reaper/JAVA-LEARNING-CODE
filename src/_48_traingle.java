public class _48_traingle extends _48_shape {


    double base;
    double height;

    _48_traingle(double base, double height){

        this.base = base;
        this.height = height;

    }

    @Override
    double area(){

        return 0.5 * base *height;
    }
}
