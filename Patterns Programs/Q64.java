/*
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
 */
import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int a = 0 ;
        for(int i = row ; i > 0 ; i--){
            for(int j = row-i ; j >0 ; j--){
                System.out.print(" ");
            }
            for(int k = row-a; k >0 ; k--){
                System.out.print(" *");
            }
              a++;
            System.out.println();
        }
    }
}
