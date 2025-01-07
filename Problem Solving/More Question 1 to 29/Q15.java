import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // 2004%4 ==0 && 2004%100!=0 that's true it's a leap year
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("That's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }
}
