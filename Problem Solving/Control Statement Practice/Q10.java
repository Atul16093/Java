// 

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the even number -: ");
        int n = sc.nextInt();

        int i =0;
        while (i<=n) {
            if(i%2==0){
                System.out.print(i+", ");
            }
            i++;
        }
    }
}
