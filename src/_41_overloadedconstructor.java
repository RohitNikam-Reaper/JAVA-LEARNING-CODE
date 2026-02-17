public class _41_overloadedconstructor {
public static void main(){

    // OVERLOADED CONSTRUCTOR :- allow a class having multiple constructor with different parameter lists.
    // enable object to be initialize in various ways

    _41_users user = new _41_users();
    System.out.println(user.username);
    System.out.println(user.email);
    System.out.println(user.age);


    _41_users user1 = new _41_users("REAPER");
    System.out.println(user1.username);
    System.out.println(user1.email);
    System.out.println(user1.age);

    _41_users user2 = new _41_users("NIGHT", "night@batman.com");
    System.out.println(user2.username);
    System.out.println(user2.email);
    System.out.println(user2.age);
    _41_users user3 = new _41_users("CAVIL", "cavilt@batman.com",33);
    System.out.println(user3.username);
    System.out.println(user3.email);
    System.out.println(user3.age);
}

}
