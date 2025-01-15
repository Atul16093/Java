/* Write a program to read data from shopping.dat file creted in above problem and find
total money */
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;
public class Q8{
    public static void main(String []args){
        File f = new File("Shopping.dat");
        try{
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Shopping s = (Shopping)ois.readObject();
        System.out.println(s);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}