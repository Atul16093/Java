/*
1
12
123
1234
12345
123456
 */
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows -: ");
        int row = sc.nextInt();
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
