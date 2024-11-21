/*
5
54
543
5432
54321
 */
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1 ; i <=row ; i++){
            int r = row;
            for(int j = 1 ; j <=i ; j++){
                System.out.print(r);
                r--;
            }
            System.out.println();
        }
    }
}
