/*
 12345
  1234
   123
    12
     1
 */
import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = row ; i >0 ; i--){
            for(int j = 0 ; j <row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i ; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
