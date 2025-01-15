/*Write a program to count how many times character ‘t’ occurs in a file.*/
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class Q4{
    public static void main(String []args){
        File f = new File ("File4.txt");
        int count = 0 ; 
        try{
            FileWriter fw  = new FileWriter(f);
            fw.write("Hello there ,I' Harry Potter pitter");
            fw.close();
            FileReader fr = new FileReader(f);
            int character;
            while((character = fr.read()) !=-1){
                if((char)character == 'T'){
                    count++;
                }else if ((char)character == 't'){
                    count++;
                }
                System.out.print((char)character);
            }
            System.out.println();
        }catch(IOException e){
            System.out.println(e);
        }
                    System.out.println("Number of P in the file is -: "+count);
    }
}