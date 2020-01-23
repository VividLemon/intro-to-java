import java.io.IOException;

public class FileApp{
    public static void main(String[] args){

        FileHelper fh = new FileHelper();
        String pathToFile = "test.txt";

        try{
            fh.getFileInfo(pathToFile);
        }catch(IOException e){
            System.out.println("There was an error...");
            System.out.println(e.toString());
        }

    }
}