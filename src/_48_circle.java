public class _48_circle extends _48_shape{


    double radius;

    _48_circle(double radius){

        this.radius = radius;

    }
    @Override
    double area(){

        return Math.PI * radius *radius;
    }


}
