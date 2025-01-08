/*
*
**
* *
*  *
*   *
*    *
*******
 */
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows -: ");
        int row = sc.nextInt();

        for(int i = 0 ; i <row ; i++){
            for(int j =0; j <=i; j++){
             /*   The comment out logic is print star only the fourth row
                // if(i==2&&j==1||i==3&&j==1||i==3&&j==2){
                //     System.out.print(" ");
                // }else{
                //     System.out.print("*");
                // }*/
                if(j==0||i==row-1||i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
