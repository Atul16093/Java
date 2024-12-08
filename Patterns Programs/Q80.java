/*
**********
**** ****
***  ***
**   **
*    *
*/
import java.util.Scanner;
public class Q80{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int a = row ;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j <row-i; j++){
                System.out.print("*");
            }
            for(int k = a ; k<row ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <row-i ; j++){
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
    }
}