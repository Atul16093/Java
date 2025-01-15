import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
public class Q1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Text -: ");
        String s = sc.nextLine();
    File f = new File("File1.txt");
    try{
        FileOutputStream fout = new FileOutputStream(f,true);
        byte b[] = s.getBytes();
        fout.write(b);
        //Read the file By FileInputSteream
        FileInputStream fin = new FileInputStream(f); 
        int character;
        while((character = fin.read())!=-1){
            System.out.print((char)character);
        }
    }catch(IOException e){
        System.out.println(e);
     }
    }
}