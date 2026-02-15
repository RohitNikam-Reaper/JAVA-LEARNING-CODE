public class _13_string {

    public static void main(String[] args){

        String name= "Night Reaper";
        String Name= "               Night Reaper           ";

        int length= name.length();
        char letter= name.charAt(0);
        int index= name.indexOf("h");
        int index2= name.lastIndexOf("e"); // last e in string
        String nameUP= name.toUpperCase();
        String nameLOW= name.toLowerCase();
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(index2);
        System.out.println(nameUP);
        System.out.println(nameLOW);
        System.out.println(Name);
        // to eliminate the spacing or widespacing of "Name"
        String name3= Name.trim();
        System.out.println(name3);
        // CHARACTER REPLACING
        String name4= name.replace("R","T");
        System.out.println(name4);
        System.out.println(name.isEmpty());
        System.out.println(name.contains("N"));

        System.out.println(name.equals("Night Reaper"));
        System.out.println(name.equals("night reaper"));


    }
}
