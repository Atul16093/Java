// Write a Java program to calculate profit or loss. 
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product Selling price -: ");
        int selling = sc.nextInt();
        System.out.print("Enter the actual cost of the product -: ");
        int cost = sc.nextInt();
        int productSelling = selling - cost;
        if(productSelling>0){
            System.out.println("Your profit is -: "+ productSelling);
        }else if(productSelling<0){
            System.out.println("Your profit is -: "+productSelling);
        }else{
            System.out.println("Neither profit nor loss");
        }
    }
}
