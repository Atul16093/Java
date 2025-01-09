// 0	4	16	36	64	..... 1 2 3 4 5 6 7 8
//  It's a square of even number

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n -: ");
        int n = sc.nextInt();
        int i = 1;
        int num = 0;
        while (i<=n) {
            if(i%2==0){
                System.out.print(num+" ");
                num = i*i;
            }
            i++;
        }
        System.out.print("....................");
        int j= 1;
        while (j<=n) {
            System.out.print(j+" ");
            j++;
        }
    }
}
