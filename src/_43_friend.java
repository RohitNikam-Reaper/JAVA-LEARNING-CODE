public class _43_friend {

    static int numoffriend; // static means it is all going to share one not make the copy
    String name;

    _43_friend (String name){
        this.name = name;
        numoffriend++;

    }
    static void showfriends (){
        System.out.println("YOU HAVE "+ numoffriend + " total friends" ); // on static attribute you don't need to use this. you can write directly
    }

}
