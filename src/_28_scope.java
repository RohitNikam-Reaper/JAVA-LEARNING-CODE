public class _28_scope {
    static int x=3; // class scope
    public static void main(String [] args){
      //  int x=1; // local scope

        System.out.println(x); // this will give output as 3

        dosomething();
    }
    static void dosomething(){
        int x=2; // local scope
        System.out.println(x);
    }
}
