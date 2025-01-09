// WAP to find out the factors of a number.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which number do you need the factor -: ");
        int num = sc.nextInt();
        int i = 1;
        //what is factor = 2*3 = 6 the 2 and 3 are factor of product 6
        while (i<=num) {
            if(num%i==0){
            System.out.println("the factor of the given number is -: "+i+" ");
        }
        i++;
    }
}
}
