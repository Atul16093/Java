/*
       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 */
import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int a = 1;
        for(int i = row ; i >=1; i--){
            for(int j = 0; j <=i ; j++){
               
                 System.out.print(" ");
                
            }
            for(int k = 1 ; k <=a; k++){
               
                System.out.print("* ");
                
            }
            a++;
            System.out.println();
        }
    }

}
