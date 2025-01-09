// 1,	4,	9,	16,	25	.....
/* The logic behind it - :
dis stand for distance 
  dis = 2*i;
  num1 = num1+dis+1
  1 = 1+2+1; -> 4
  4 = 4+4+1; -> 9
  9 = 9+6+1; -> 16
 */
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int num1 = 1;
        while (i<=n) {
            int dis = 2*i;
            System.out.print(num1 + " ");
            num1 = num1 + dis + 1;
            i++;
        }
    }
}
