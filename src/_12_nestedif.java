import javax.swing.plaf.synth.SynthOptionPaneUI;

public class _12_nestedif {

    public static void main(String[] args) {

        // nested if

        boolean isStudent= false;
        boolean isSenior=false;
        double price= 9.99;


        if (isStudent){
            if(isSenior){
                System.out.println("you got a senior discount of 20%");
                System.out.println("you got a student discount of 10 %");
                price*=0.7;

            }
            else{
                System.out.println("you got a student discount of 10 %");
                price*=0.9;

            }
        }

        else {

            if(isSenior){

                System.out.println("you got a senior discount of 20%");
                price*=0.8;
            }
            else{
                price*=1;
            }
        }

        System.out.printf("the price of the ticket is : $ %.2f", price);


        }
    }
