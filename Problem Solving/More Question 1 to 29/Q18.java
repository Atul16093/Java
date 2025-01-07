
// W.A.P to check whether given number is even or odd Without using % operator. 
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter your Number -: ");   
        int num = sc.nextInt();
        /*
         The logic is 1/2==0 ,3/2==1 
         if number is given us one then the number is odd else it's even
         */
        if(num/2!=0 ||num==1){
            System.out.println("Number is odd");
        } else{
            System.out.println("Number is even");
        }                                  
    }          
}
