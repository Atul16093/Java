/* Print the right align triangle
 
 *
  * 
   *
    *  
 */

import java.util.Scanner;

public class Q3_Right_Align_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of star -: ");
        // This line is taking a input of star
        int star_num = sc.nextInt();
        for (int i = 0; i < star_num; i++) {
               for(int j =0 ; j<=i; j++){
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               }
               System.out.println();
        }
    }
}
