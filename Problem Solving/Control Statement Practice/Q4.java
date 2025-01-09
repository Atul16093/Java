// WAP to print table of a number

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input from the user
        System.out.print("Which number table do you want to print -: ");
        int tab = sc.nextInt();
        int i = 1;
        //creating a variable for storing multification data
        int table = 0;
        //running loop into the 10 times
        while (i<=10) {
            table = tab*i;
            //Print table every time
            System.out.println(tab+" x "+i+ "="+table);
            i++;
        }
    }
}
