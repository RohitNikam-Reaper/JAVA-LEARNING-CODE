public class _27_overloadmethods {

    public static void main(String[] args){
        // overloaded methods= same name differnet parameters
        // signature = name+paranemeter
        // not two method can have signature


        System.out.println(add(1,2,3));
        String pizza =bakepizza("flatbread","mozzarella", "pepparoni");
        System.out.println(pizza);


    }
    static double add(double a,double b){
        return a+b;
    }
    static double add(double a,double b,double c){
        return a+b+c;
    }
    static double add(double a,double b,double c,double d){
        return a+b+c+d;
    }

    static String bakepizza(String bread){
        return  bread + " pizza";
    }
    static String bakepizza(String bread,String cheese){
        return cheese +" "+ bread + " pizza";
    }
    static String bakepizza(String bread,String cheese,String topping){
        return  topping + " "+ cheese +" "+ bread + " pizza";
    }
}
