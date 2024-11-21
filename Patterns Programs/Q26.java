/*
*
*#
*#*
*#*#
*#*#*
*#*#*#
 */
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input of number of row 
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = 0 ; i <=row ; i++){
            for(int j = 0 ; j <=i ; j++){
                if(j % 2 == 0){
                    System.out.print("*");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
