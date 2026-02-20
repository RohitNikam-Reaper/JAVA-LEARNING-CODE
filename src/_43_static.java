
public class _43_static {
    public static void main(String[] agrs){

    _43_friend friend1 = new _43_friend("spongebob");
        System.out.println(_43_friend.numoffriend);
        _43_friend friend2 = new _43_friend("patrik");
        System.out.println(friend1.name);
        System.out.println(_43_friend.numoffriend); // it gives one for both
        // to fix this issue of this we use static keyword so it undestasnd about that not use copy for that
        // static means it is all going to share 1

        // for to do this professionally we need to write it using the class
        // how we were doing is friend1.name but use class name
        _43_friend.showfriends();

        // utility method also use this


        Math.round(3.99);
    }
}
