/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
*/
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows -: ");
        int row = sc.nextInt();
        int k = 1;
        for(int i = 1; i <=row; i++){
            for(int j = 0 ; j <i; j++){ 
                System.out.print(k+" ");
                k ++;
            }
            System.out.println();
        }
    }
}
