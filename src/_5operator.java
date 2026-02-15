public class _5operator {

    public static void main(String[] args){

        // assignent operator

        int a=7;
        int b=4;
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;

        System.out.println("ADDITION " + c);
        System.out.println("SUBTRACTION " + d);
        System.out.println("MULTIPLICATION " + e);
        System.out.println("DIVISION " + f);
        System.out.println("MODULAS " + g);

        //AUGUMENTED ASSIGNMENT OPERATOR

        a +=b;
        System.out.println(a);
        a -=b;
        System.out.println(a);
        a *=b;
        System.out.println(a);
        a /=b;
        System.out.println(a);
        a%=b;
        System.out.println(a);

        // INCREMENT AND DECREMENT OPERATOR
        int x=9;
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        //ORDER OF OPERATION [P-E-M-D-A-S]

        double result= 3*7+9-5*(55-80)/2;
        System.out.println(result);

    }

}
