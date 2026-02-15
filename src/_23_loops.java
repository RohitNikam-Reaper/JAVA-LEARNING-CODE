import java.util.Scanner;

public class _23_loops {

    public static void  main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("COUNDOWN TO NEW YEAR");
        int max = scanner.nextInt();
        for(int i=max;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000); // thread class put the programm to sleep for some time so it works as a counting

        }
        System.out.println("Happy New Year");
        scanner.close();
    }
}
