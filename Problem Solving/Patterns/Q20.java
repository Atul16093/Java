/*
1
12
1 3
1  4
12345
 */
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row -: ");
        int row = sc.nextInt();

        for(int i = 1 ; i <=row ; i++){
            for(int j = 1 ; j <=i ; j++){
                if( j==1|| i==row || i==j){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
