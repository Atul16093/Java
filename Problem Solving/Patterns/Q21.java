/*
1
22
3 3
4  4
55555
 */
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1;i<=row; i++){
            for(int j = 1 ; j <=i ; j++){
                if(j==1||i==j||i==row){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
                }
            System.out.println();
        }
    }
}
