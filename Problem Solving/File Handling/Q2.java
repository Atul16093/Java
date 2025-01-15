import java.io.File;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.Serializable;
public class Q2 implements Serializable{
     private int a , b;
    public Q2(int a , int b ){
        this.a = a ;
        this.b = b ;
    }
    public Q2(){}
    public static void main(String []args){
        Q2 obj = new Q2(5,6);
        File f = new File("abcd.txt");
        try{
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream obj1 = new ObjectOutputStream(fout);
        obj1.writeObject(obj);
        System.out.println("Success");
        obj1.close();
        }catch(IOException e){
            System.out.print(e);
        }
    }
}