/*
      *
     *_*
    *___*
   *_____*
  *_______*
 *_________*
*************
 */
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int a = 0;
        for(int i = 1 ; i <=row ; i++){
            for(int j = 1 ; j <=row-i; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=a+i; k++){
                if(k==1 || k==a+i || i==row ){
                System.out.print("*");
                }else{
                    System.out.print("_");
                }
            }
            a++;
            System.out.println();
        }
    }
}
