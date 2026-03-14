    import java.util.Scanner;

    public class _04Madlibgame {

        public static void  main(String[] args){

            Scanner scanner =  new Scanner(System.in);

            String adjective1;
            String noun1;
            String adjective2;
            String verb1;
            String adjective3;

            System.out.print("ENTER AN ADJECTIVE (DESCRIPTION): ");
            adjective1=scanner.nextLine();
            System.out.print("ENTER A NOUN (ANIMAL OR PERSON): ");
            noun1=scanner.nextLine();
            System.out.print("ENTER AN ADJECTIVE (DESCRIPTION): ");
            adjective2=scanner.nextLine();
            System.out.print("ENTER A VERB END WITH -ing (action): ");
            verb1=scanner.nextLine();
            System.out.print("ENTER AN ADJECTIVE (DESCRIPTION): ");
            adjective3=scanner.nextLine();

            System.out.println("today the weather is great so i went to the "+ adjective1 + " amusement park.");
            System.out.println("in an exibition i saw someone who is none other than " + noun1 + " itself.");
            System.out.println(noun1 + " was " + adjective2 +" and " +verb1 + " !");
            System.out.println("i was " + adjective3 + " !");


            scanner.close();
        }
    }
