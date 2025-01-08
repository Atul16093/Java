/*
 1234567891011
  123456789
   1234567
    12345
     123
      1
 */
import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt(); 
        int a = 0;
        for(int i = row ; i >=0 ; i--){
            for(int j = row-i ; j >=0 ; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= (row*2+1)-a; k++){
                System.out.print(k);
            }
            a = a+2;
            System.out.println();
        }
    }
}
