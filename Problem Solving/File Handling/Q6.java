/* Write a program to count number of bytes in a image file(jpeg/png/gif). Also find how
much time it will take to upload the file on server if internet speed is 256 bps(bitsper
second).*/
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class Q6{
    public static void main(String[]args){
        String s = "backiee-54754.jpg";
        File f = new File(s);
        int ips = 256;
        //Here We are converting our bytes into the bit f.length() gave us answer in the bytes
        double time = ((double)(f.length()*8)/ips);
        System.out.print("Total number of seconds it takes is -: "+time+" Seconds \nBytes of the image is -: "+(f.length()));
    }
}