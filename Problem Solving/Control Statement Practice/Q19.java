
// 1	+	1/2	+	1/3	+	1/4	+	1/5	..... n terms(find out sum)
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        // Taking a input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // creating all variable we need
        double n1 = 1, n2 = 0.0f;
        int i = 1;
        while (i <= n) {
            if (i == n - 1) {
                System.out.println(n1 + "/" + i);
            } else {
                System.out.print(n1 + "/" + i + " + ");
            }
            n2 += n1 / i;
            i++;
        }
        System.out.println("The sum of all divisiable number is -: " + n2);
    }
}
