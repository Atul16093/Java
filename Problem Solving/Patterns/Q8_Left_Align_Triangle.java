/*
 Printing the left align triangle 

 */
import java.util.Scanner;

public class Q8_Left_Align_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows -: ");
        int row = sc.nextInt();
        for(int i = 0 ; i <row ; i++){
            for(int j = 0 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
