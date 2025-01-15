/*Write a program to count no of words in a text file and average word size.
Average of word formula is -: 
dividing the number of letters by the number of words.*/
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Q5{
    public static void main(String []args){
        int count = 1;
        int charCount = 0;
        File f = new File("File5.txt");
        try{
            FileWriter fw = new FileWriter(f);
            fw.write("Serialization use for converting class object to stream and the Deserialization means converting stream to class object");
            fw.close();
            FileReader fr = new FileReader(f);
            int character ;
            while ((character = fr.read())!= -1){
                //In the ascii value space assign on 32
                if(character==32){
                    count++;
                }else if ((character>=65 | character <=90)){
                    charCount++;
                }
                System.out.print((char)character);
            }
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("\nTotal No of words is -: "+count+"\nAnd the Average of each word is -: "+((double)charCount/count));
    }
}