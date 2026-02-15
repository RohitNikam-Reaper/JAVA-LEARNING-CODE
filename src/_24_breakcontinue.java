public class _24_breakcontinue {

    public static void  main(String[] agrs){

        for(int i=0;i<10;i++){
            if(i==7){
                System.out.println("THALA FOR A REASON");
                break;
            }
            System.out.print(i + " ");
        }
        for(int i=0;i<10;i++){
            if(i==6){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
