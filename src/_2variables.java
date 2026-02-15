public class _2variables {

    public static void main(String[] args) {

        // TYPES OF VARIABLES
        /*
        PRIMITIVE  AND REFERENCE
        int             string
        double          array
        char            object
        boolean

        TWO STEPS TO CREATE A VARIABLE
        1. DECLARATION
        2. ASSIGNMENT
        */

        // 1. DECLARATION
        // datatype (variable name);
        // but you have to ASSIGN IT A VALUE
        int age = 10;
        System.out.println(age);

        float mark = 9; // stores only one value and given the decimal answer output will be 9.0
        double marks = 89.77; // store the value in decimals
        System.out.println(mark);
        System.out.println(marks);

        System.out.println("my name is rohit my age is " + age +" and my marks is " + marks);

        char alphabet= 'A';
        char symbol='#';
        System.out.println("my alphabet is " + alphabet);
        System.out.println("my symbol is " + symbol);


        boolean system=false;
        boolean isStudent=true;
        // CamelCase it is a thing in where variable contain 2 names
        // name then 1st letter will be small of 1stt and 2nd will be capital of 2nd
        // just in this isStudent i is small and S is Capital

        System.out.println(system);

        if(isStudent){
            System.out.println("You are a Student");
        }
        else{
            System.out.println("you are a NOT a student");
        }


        String name="NIGHTREAPERX2"; // String
        System.out.println("hello " + name);
        System.out.println("hello " + name + "age is " + age + " " + marks);

        int Class = 7;
        double Price = 12.99;
        char sale= 'A';
        String MONEY= "$12.99";
        boolean isMood= true;


    }
}