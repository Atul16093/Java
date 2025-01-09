/*
 55555
  4444
   333
    22
     1
 */
import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = row ; i >0 ; i--){
            for(int j = 0 ; j <row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i ; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
