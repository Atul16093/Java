
// WAP to check whether entered number is perfect or not
import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number -: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n / 2) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println("it's a perfect number");
        } else {
            System.out.println("It's not a perfect number");
        }
    }
}
