import java.io.File; 
import java.io.FileWriter;
//IOException belong from io package
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class Test1{
    public static void main(String []args){
        // How to read data from the file
        //At that time the clone is created of Read.txt file    
    File file = new File("Read.txt");
    // There are two many method in IO package , Please Preferd Java Docs
   System.out.println(file.canExecute());
   System.out.println(file.canRead());
   System.out.println(file.canWrite());
   System.out.println(file.delete());
   
    //createNewFile() thrown io exception so you either need to handle or throws the exception
    try{
        //File only created in single time if you run code multiple time it'll show fill not created
     if(file.createNewFile()){
        System.out.println("File Successfully Created ");
              }else{
                System.out.println("File Not Created");
              }
        }catch(Exception e){
            System.out.print(e);
        }
    try{
    FileWriter fw = new FileWriter(file);
        fw.write("This is the first content by the file writer Test1 ");
        System.out.println("File Written successfully");
        //Writer class close must be important, If we not closed the file We cann't see the output
        fw.close();
        //If we are not using the BufferedReader So We saw a ASCII Value Like It'll showing a first letter suppose 'T' It's ASCII Value is 84 .
    FileReader fr = new FileReader(file);
     BufferedReader br = new BufferedReader(fr);
      String line ;
         while((line = br.readLine()) != null){
            System.out.print(line);
         }
       }catch(IOException e){
        System.out.println(e);
       }
    }
}