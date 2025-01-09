//  WAP to find out the factorial of a number.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which Number Factorial do you need enter it -: ");
        int num = sc.nextInt();
        int i = 1;
        int factorial = 1;
        while (i<=num) {
            /*
            That's the logic behind it
             * 1 += 1*1 = 1+1 = 2
             * 2 += 2*2 = 2+4 = 6
             * 6 += 6*3 = 6+18 = 24
             * 24+= 24*4 = 24+96 = 120
             * when we use that type of statement 
             * factorial += factorial*i;
             */
            factorial = factorial*i;
            i++;
        }
        System.out.println("The factorial of given number is -: "+factorial); 
        int fac = 1; 
        for(int j =num;j>=1;j--){
            fac = fac*j;
        }
        System.out.println(fac);
    }
}
