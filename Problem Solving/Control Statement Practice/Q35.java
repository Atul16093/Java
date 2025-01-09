// WAP to count number of digits
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number -: ");
        int number = sc.nextInt();
        int count = 0;
         while (number>1) {
            number /=10;
            count++;
         }
         System.out.println(count);
    }
}
