/*
1
222
33333
4444444
555555555
 */
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of row -: ");
        int row = sc.nextInt();
        int r = 1;
        for(int i = 0 ; i <2*row ; i+=2){
            for(int j = 0 ; j <=i ; j++){
                System.out.print(r);
            }
            r++;
            System.out.println();
        }
    }
}
