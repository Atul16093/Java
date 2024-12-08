/*
********
*** ***
**  **
*   *
*   *
**  **
*** ***
********
*/
import java.util.Scanner;
public class Q81{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int half = row/2;
        int v  = 1;
        for(int i  = 0 ; i <row ; i++){
            if(i <half){
            for(int j = 0 ; j < (half-i) ; j++){
                System.out.print("*");
            }
                for(int k = 0 ; k <i ; k++ ){
                    System.out.print(" ");
                }
                for(int j = 0 ; j <(half-i);j++){
                    System.out.print("*");
                }
            }else {
                for(int s = 0 ; s <=(i-half); s++){
                    System.out.print("*");
                }
                for(int k = 0 ; k < (half-v) ; k++){
                    System.out.print(" ");
                }
                for(int s = 0 ; s<=(i-half) ; s++){
                    System.out.print("*");
                }
                 v++;
            }
            System.out.println();
        }
    }
}