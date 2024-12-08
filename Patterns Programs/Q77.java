/*
*************
**         **
* *       * *
*  *     *  *
*   *   *   *
*    * *    *
*     *     *
*    * *    *
*   *   *   *
*  *     *  *
* *       * *
**         **
*************
*/
import java.util.Scanner;
public class Q77{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of row -: ");
        int row =sc.nextInt();
        int a = row;
        for (int i = 0 ; i <= row ; i++){
            for(int j = 0 ; j <=row ; j++){
                if(i==0 || i==row || j==0 || j==row || i==j || j==a){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            a--;
             System.out.println();
        }
    }
}