/* Read user credentials from a CSV file ( users.csv ) containing username and hashed password pairs.
Prompt the user to enter their username and password.
Validate the entered credentials against the data stored in the CSV file.
If the credentials are valid, allow the user to check their bank account balance.
Display an appropriate message if the credentials are invalid or if the user is not found in the CSV file.
csv file always take data in the form of row and column Comma Seprated Value
*/
import java.io.*;
import java.util.Scanner;
public class Test4{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of data do you want to take -: ");
        int size = sc.nextInt();
        String []arr = new String[size];
        String []arr1 = new String[size];
        String fileName = "Example7.csv";
    File file = new File(fileName);
    // PrintWriter obj = new PrintWriter(file)
    try(FileWriter obj = new FileWriter(file)){
                obj.write("Name , Password\n");
          for(int i = 0 ; i <size ; i++){
                System.out.print("Enter your name -: ");
                arr[i] = sc.next();
                System.out.print("Enter your password -: ");
                arr1[i] = sc.next(); 
         obj.write(arr[i] +","+ arr1[i]+"\n");
             }
          }catch(Exception e){
              System.out.print(e);    
          }
        System.out.println("User input -: ");
        System.out.print("Enter your Name -: ");
             String name = sc.next();
        System.out.print("Enter your password -: ");
             String password = sc.next();
        for(int i = 0 ; i <size ; i++){
            if(name.equals(arr[i])&&password.equals(arr1[i])){
                System.out.print("Data Found -: ");
                System.out.print(arr[i] +","+ arr1[i]);
                break;
             }
        }
     }
}
