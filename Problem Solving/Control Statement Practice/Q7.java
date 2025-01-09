// WAP to check whether entered number is prime or not.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("which number do you want to check -: ");
        int num = sc.nextInt();
        //creating a boolean variable that help use to break our statement
        boolean isprime = true;
        int i = 2;
        while(i<num){
            if(num%i==0){
                isprime = false;
                break;
            }
                i++;
            }
            if(isprime && num>1){
                System.out.println("The number is a prime number ");
            }else {
                System.out.println("It's not a prime number ");
            }
        }
    }

