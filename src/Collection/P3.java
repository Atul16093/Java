package Collection;

/*WAP to store integer values in arraylist and display only those numbers which are perfect numbers. */

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList<>();
        System.out.print("Enter the number of input do you want to enter : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <=n ; i++){
            System.out.print("Enter the input for index "+i+" : ");
            int num = sc.nextInt();
            al.add(num);
        }
        ListIterator <Integer> lit = al.listIterator();
        System.out.print("Perfect number is these : " );
        while (lit.hasNext()) {
            int getDigit = lit.next();
            int i = 1 ;
            int sum = 0 ;
            if(getDigit > 0){
            while(getDigit > i){
                if(getDigit % i == 0){
                    sum += i;
                }
                i++;
            }
            if(sum == getDigit){
                System.out.print(sum+" ");
            }
        }
            /* 
            int i = 2;
            boolean flag = true;
            while (getDigit > i) {
                if(getDigit % i == 0){
                    flag = false;
                }
                i++;
            }
            if(flag == true){
                System.out.println(getDigit);
            }
            */
        }
    }
}
