import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P2 {
    public static void main(String[] args) {
        // It's a path name contructor
        File obj = new File("MyFile.txt");
        // Creating a file by using createNewFile
        try {
            if (obj.createNewFile()) {
                System.out.println("File created successfully");
            }else{
                System.out.println("FIle already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //For stop the overriding we use true in filewriter 
        try(FileWriter fw = new FileWriter(obj,true)){
            fw.write("I'm ironman");
        }catch(IOException e){
            e.printStackTrace();
        }
        try(FileReader fr = new FileReader(obj);BufferedReader br = new BufferedReader(fr)){
            
            System.out.println(br.readLine());
            // System.out.println(fr.read());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
