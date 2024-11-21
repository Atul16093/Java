/*
111111
222222
333333
444444
555555
 */
import java.util.Scanner;

public class Q6_Same_Digit_In_Row {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the numbers of row -:  ");
        int row = sc.nextInt();
        System.out.print("Enter the numbers of column -:  ");
        int column = sc.nextInt();
        for(int i = 1 ; i <=row ; i++){
            for(int j = 1 ; j <=column ; j++ ){
              System.out.print(i);
            }
            System.out.println();
        }
    }
}

