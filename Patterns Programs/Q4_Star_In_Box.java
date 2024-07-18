/*
   fill star in a single box 

*****
*****
*****
*****
*****

 */
import java.util.Scanner;

public class Q4_Star_In_Box {
    public static void main(String[] args) {
        //we are taking input from the star for print the star 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows   -: ");
        int star_num  = sc.nextInt();
        System.out.print("Enter number of column-: ");
        int star_col = sc.nextInt();
        for(int i = 0 ; i < star_num; i++){
            for(int j = 0 ; j < star_col; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
