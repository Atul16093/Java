// WAP to print N natural numbers in reverse order

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking a input from the user 
        System.out.print("Enter first n natural number -: ");
        int n = sc.nextInt();
        //using while loop in reverse order
        int i = n;
        while (i>=1) {
            System.out.print(i+", ");
            --i;
        }
    }
}
