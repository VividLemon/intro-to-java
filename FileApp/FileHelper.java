import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException; // redundant?

public class FileHelper{

    public void getFileInfo(String filePath) throws IOException{
        File f = new File(filePath);
        
        if(f.exists()){
        System.out.println("File Name: " + f.getName());
        System.out.println("Size in bytes:" + f.length());
        System.out.println("Full Path: " + f.getCanonicalPath());
        System.out.println("Relative Path: " + f.getPath());
        }else{
            System.out.println("The file does not exist!");
        }
    }

}