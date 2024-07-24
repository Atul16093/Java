/*
1
123
12345
1234567
123456789
 */
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the n number -: ");
       int row = sc.nextInt();
       for(int i = 1 ; i <=2*row; i+=2){
        for(int j = 1 ; j<=i ; j++){
            System.out.print(j);
        }
        System.out.println();
       }
    }
}
