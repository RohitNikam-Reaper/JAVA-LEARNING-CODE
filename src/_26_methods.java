public class _26_methods {

    public static void main(String[] agrs) {

        // methods= a block of reusable code that is executed when called ()

        String name = "parrytheplatypus";
        int age = 25;
        happybirthday(name, age);

        double number = 35;
        double result = square(number);
        double result2 = cube(number);
        System.out.println("the square of the " + number + " is " + result);
        System.out.println("the cube of the " + number + " is " + result2);



        String fullname = naming("SPONGEBOB", "SQAREPANTS");
        System.out.println(fullname);
        int age2 = 32;

        if (agecheck(age2)) {
            System.out.println("you can signup you are adult");
        } else {
            System.out.println("you can NOT an adult to signup");

        }
    }

    static void happybirthday(String name, int age) {
        System.out.println("I WISH YOU A HAPPY BIRHTDAY");
        System.out.println("AND HAPPY BIRTHDAY WHOEVER THE f is " + name);
        System.out.println("AND also you " + name + "who is " + age + " yrs old");
        System.out.println("I WISH YOU A HAPPY BIRHTDAY\n");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String naming(String name1, String name2) {
        return name1 + " " + name2;
    }

    static boolean agecheck(int ageing2) {
        if (ageing2 >= 18) {
            return true;
        } else {
            return false;
        }

    }
}

