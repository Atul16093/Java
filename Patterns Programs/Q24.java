/*
*
* *
* @ *
* @ @ *
* * * * *
*/
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = 0 ; i <=row ; i++){
            for(int j = 0 ; j <=i ; j++){
                if(j==0 || i==j || i==row){
                    System.out.print("* ");
                }else{
                    System.out.print("@ ");
                }
            }
            System.out.println();
        }
    }
}
