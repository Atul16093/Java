/*
     1
    22
   333
  4444
 55555
666666
 */
import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = 1 ; i <=row ; i++){
            for(int j = 1 ; j <=row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
