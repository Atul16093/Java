/*
12345
1234
123
12
1
 */
import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = 0 ; i<=row; i++){
            for(int j = 1 ; j<=row-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
