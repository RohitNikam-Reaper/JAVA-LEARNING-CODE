import java.util.Scanner;

public class _33_arraysearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] number = {1,4,5,6,67,5677,23,52,66};
        int targer = 345;
        boolean isfound = false;

        //linear search
        for (int i=0;i<number.length;i++){
            if (targer == number[i]) {
                System.out.println("element found at index: " + i);
                isfound = true;
                break;
            }
        }
        if (!isfound){
            System.out.println("element not found in the array");
        }

        String[] vegetable={"ladyfinger","onion","potato","brinjal"};
        boolean isfind=false;
        String target;
        System.out.print("enter the vegetable you are looking for in the array:- ");
        target = scanner.nextLine();
        for (int i=0;i<vegetable.length;i++){
            if (vegetable[i].equals(target)){
                System.out.println("element found at index:- "+ i);
                isfind  = true;
            }
        }
        if (!isfind){
            System.out.println("ELEMENT  NOT FOUND IN THE ARRAY");

        }


    }
}
