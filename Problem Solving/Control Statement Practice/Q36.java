// WAP to reverse a number
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number -: ");
        int num = sc.nextInt();
        //num = 25;
        int reverse = 0 , reminder;
        while (num!=0) {
            reminder = num%10;
            reverse =  reminder;
            System.out.print(reverse);
            num /=10;
        }
    }
}
