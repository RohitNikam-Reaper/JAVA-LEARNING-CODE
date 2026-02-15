public class _10_Printf {

    public static void main(String[] args){

        // %[flags] [width] [.precision] [specifier-character]

        String name= "FLOWTIVES";
        char firstname= 'F';
        int age= 23;
        double height= 1.8;
        boolean ALIVE = true;

        System.out.printf("hello %s \n" , name);                               // String %s
        System.out.printf("your name first letter is %c \n", firstname);       // char   %c
        System.out.printf("your age is %d \n" , age);                             // int   %d
        System.out.printf("your height is %.2f \n", height);                        // double %f
        System.out.printf("Mr %s are you alive :  %b \n", name, ALIVE);        // boolean  %d

        // use % to specify then .(digit) how many decimal places you want  then write the datatype

        double value = 199.99945;
        double value1 = -56568868.647;
        double value2 = 45056460.4523456;
        System.out.printf(" HELLO MR %.4s  your age is %d \n", name ,age);
        System.out.printf("your sales increment is %.3f \n", value2);
        System.out.printf("%+.3f \n", value); // display positive before any posivite number
        System.out.printf("%,.4f \n", value2); // comma seperator for thousand places
        System.out.printf("%(.4f \n",value1); // shows the value in negative in parenthesis
        System.out.printf("%(.4f \n",value); // shows the value in negative in parenthesis

        // USING SPACE BEFORE POINT will gonna tell if postive then space if negative - shows
        System.out.printf("% .4f \n",value1);
        System.out.printf("% .4f \n",value);

        // ZERO PADDING

        int id1 = 2;
        int id2 = 32;
        int id3 = 2563;
        int id4 = 763;

        // for zero padding write %0 then write the number after zero how many padding needed

        System.out.print("zero padding concept\n");
        System.out.printf("%04d \n", id1);
        System.out.printf("%04d \n", id2);
        System.out.printf("%04d \n", id4);
        System.out.printf("%04d \n", id3);

        // witout zero right padding happen
        System.out.print("without zero it will be right padding concept\n");
        System.out.printf("%4d \n", id1);
        System.out.printf("%4d \n", id2);
        System.out.printf("%4d \n", id4);
        System.out.printf("%4d \n", id3);

        System.out.print("with negative it will be left padding concept\n");
        System.out.printf("%-4d \n", id1);
        System.out.printf("%-4d \n", id2);
        System.out.printf("%-4d \n", id4);
        System.out.printf("%-4d \n", id3);



    }
}
