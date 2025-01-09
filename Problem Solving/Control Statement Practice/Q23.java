// 1	9	25	49	81	.....
//It's a square of odd  number
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n -: ");
        int n = sc.nextInt();
        int i = 1;
        int num = 1;
        while (i<=n) {
            if(i%2!=0){
                num = i*i;
                System.out.print(num+" ");
            }
            i++;
        }
    }
}
