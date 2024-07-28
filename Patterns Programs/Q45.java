/*
    5
   44
  333
 2222
11111
 */
import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int a = row;
        for(int i=1 ; i<=row ; i++){
            for(int j = 1 ; j <=row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i ; k++){
                System.out.print(a);
            }
            a--;
            System.out.println();
        }
    }
}
