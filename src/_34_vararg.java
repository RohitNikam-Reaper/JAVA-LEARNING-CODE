public class _34_vararg {
    public  static void main(String[] agrs){
        // varargs-> allow as method to accept a varing number of arguments  makes method more flexible, no need
        // for overloading methods

        // we make multiple methods for diffrent numbers like two variables means same method but diffrent number of
        //input decide instead we make one

        // three dot (...) means (ellipsis)
       // java will pack an argument into an array

        System.out.println(adds(1,2,3,5,7));
        System.out.println(average());
        System.out.println(average(3,6,7,4,67,3     ));

    }
    static void  add(int... numbers   ){
        System.out.println(numbers); // we get memory address
    }
    static int  adds(int... numberss   ){
        int sum=0;
        for (int numbbers:numberss){
            sum += numbbers;
        }
        return sum;
    }
    static double average(double... number){
        double  sums=0;
        if (number.length == 0){ // because givign nothing will provide Nan
            return 0;
        }
        for(double num : number){
            sums += num;
        }
        return sums / number.length ;
}
}