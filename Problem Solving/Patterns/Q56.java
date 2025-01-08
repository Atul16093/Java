/*
     1
    123
   12345
  1234567
 123456789
 */
import java.util.Scanner;
public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int b = 1;
        for(int i = 0 ; i <row ; i++){
            for(int j = 0 ; j<row-i; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i+b ; k++){
                System.out.print(k);
            }
             b++;
            System.out.println();
        }
    }
}
