//Read Write Classes
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class Tester2{
    public static void main(String []args){
        File f = new File("do.txt");
    try{
        //Writing the file  by the help of FileWriter
        FileWriter fw = new FileWriter(f);
          fw.write("Hello , This is a writer class of File Handling ");
          fw.close();
        FileReader fr = new FileReader(f);
        //Read File By the help of BufferedReader
        /*   BufferedReader br = new BufferedReader(fr);
           String line ;
           while((line = br.readLine()) !=null){
            System.out.print(line);
           }
        System.out.println(fr.read());*/
        //Read File By the help of FileReader
        int character ;
        while((character = fr.read()) != -1){
            System.out.print((char)character);
        }
      }catch(IOException e){
        System.out.print(e);
      }
    }
}