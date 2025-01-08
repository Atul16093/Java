/*
1234567
1234567
1234567
1234567
1234567
 */
import java.util.Scanner;

public class Q5_Index_Number {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the numbers of row -:  ");
        int row = sc.nextInt();
        System.out.print("Enter the numbers of column -:  ");
        int column = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            for(int j = 1 ; j <=column ; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
