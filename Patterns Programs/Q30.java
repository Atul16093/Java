/*
******
*****
****
***
**
*
 */
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = 0 ; i <=row ; i++){
            for(int j = row ; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
