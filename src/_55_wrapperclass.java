public class _55_wrapperclass {
    public static void main(){

        // WRAPPER CLASS:- ALLOW PRIMITIVE VALUES (int,char,double,boolean) to be used as objects.
        //                  "wrap them into an object"
        //                 generally don't wrap primitives unless you need an object
        // ALLOW USE OF Collection Framework and Static Utility Methods

        int a = 123; // use this 123 as OBJECTS
        Integer b = new Integer(123);
        Double c = new Double(3.14);
        Character d = new Character('$');
        Boolean e = new Boolean(true);
        // this is the OLD WAY

        //"THE NEW WAY TO USE THE WRAPPER CLASS IS ASSIGN THEM DIRECTLY"

        // THIS IS AUTOBOXING
        Integer i = 124;
        Double j = 3.14;
        Character k = '$';
        Boolean l = true;
        // SIMILAR TO STRINGS
        String m = "pizza";

        // CHAGING THE OBJECT BACK TO PRIMITIVE
        // UNBOXING

        int w = b;
        double x = c;
        char y = d;
        boolean z = e;

        // utility methods

        String p= Integer.toString(123);
        String q= Double.toString(3.14);
        String r= Character.toString('$');
        String s= Boolean.toString(false);

        String t = p+q+r+s;
        System.out.println(t);


        //parsing

        int g= Integer.parseInt("123");
        double h= Double.parseDouble("3.14");
        char u= "pizza".charAt(0); // doesnt have parse char therefore we use charAt
        boolean v= Boolean.parseBoolean("true");

        // you can't add like the above one different datatypes

        //UTILITY METHODS

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
        System.out.println(Character.isLowerCase(letter));
    }
}
