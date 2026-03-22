import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class _58_writefile {
    public static void main(String[] args){

    //how to write a file using java


        // BufferWriter = Better Performance  for large amount of text
        //PrintWriter = Best for structed data, like reports or logs
        // FileWriter = good for small and medium sized text files
        // FileOutputStream = Best for Binary Files (eg., images , audio files)


        // better organization

        String filepath = "C:\\Users\\Rohit Nikam\\Desktop\\testing.txt";
        String filecontext = """
                roses are red
                voilets aere blue
                rocking rocking
                everywhere
                everywhere
                """;

        try(FileWriter writer = new FileWriter("test.txt")){
            writer.write("i like pizza! \n it is really good");
            System.out.println("file is written");
        }
        catch (FileNotFoundException e){
            System.out.println("could not locate file location");
        }
        catch(IOException e){
            System.out.println("could not write file");
        }

        try(FileWriter writer = new FileWriter(filepath)){
            writer.write(filecontext);
            System.out.println("file is written");
        }
        catch(IOException e){
            System.out.println("could not write file");
        }
    //"C:\Users\Rohit Nikam\Desktop\testing.txt"
        // to many new lines use multi line string

    }
}
