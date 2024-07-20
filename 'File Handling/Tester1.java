// If we want to convert our string data(Character Stream class data ) so basically we use FileOutputStream as an object and use getBytes() method
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileWriter;
public class Test1 {
    public static void main(String[] args) {
        //If the file doestn't exist , so we need to run createNewFile() method 
        //If the file exist already so we doestn't need to run createNewFile() method
        File f = new File("abc.txt");
        try{
        FileOutputStream fout = new FileOutputStream(f);
        FileWriter fw = new FileWriter(f);
           String a = fw.write("Hello , What's going on ");
             String s = "Hello world";
              byte b[] = s.getBytes();
              fout.write(b);
          }catch(IOException e){
            System.out.println(e);
          }
        // try{
        //      f.createNewFile();
        // }catch(IOException e){
        //     System.out.println(e);
        // }
       

    }
}
