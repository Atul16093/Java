// WAP to find out the sum of N natural number.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input from the user
        System.out.print("Enter the number -: ");
        int numb = sc.nextInt();
        int i = 0;
        //create a new sum variable for storing addition number
        int sum=0;
        while (i<=numb) {
            sum += i;
            i++;
        }
        System.out.println("The sum of first N natural number is -: "+sum);
    }
}
