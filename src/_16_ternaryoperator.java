public class _16_ternaryoperator {
    public static void main(String[] arg){

        //ternary operator

        // use if else or use ternanry operator

        //if - else :-

        int score = 13;

        if(score>=33){

            System.out.println("pass");
        }

        else{
            System.out.println("fail");
        }

        //or use ternanry operator

            String passorfail= (score>=33)? "pass" : "fail";
        System.out.println(passorfail);

        int number= 5;

        String evenorodd = (number%2==0)?"EVEN":"ODD";
        System.out.println(evenorodd);

        int hour = 12;
        String  timeofday= (hour<12)?"AM":"PM";
        System.out.println(timeofday);

        int income = 500000;
        double taxrate = (income >= 40000)? 0.25 : 0.15;
        System.out.println(taxrate);

    }
}
