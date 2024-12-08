/*
*    *
**   **
***  ***
**** ****
**********
*/
import java.util.Scanner;
public class Q79{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int a = 1;
        for(int i = 0 ; i <row ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }
            for(int k = a ; k < row ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <=i ; j++){
                System.out.print("*");
            }
            a++;
            System.out.println();
        }
    }
}