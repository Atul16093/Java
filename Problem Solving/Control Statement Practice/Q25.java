// 1	27	125	343	............	

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n -: ");
        int n = sc.nextInt();
        int i = 1;
        int num = 0;
        while (i<=n) {
            if(i%2!=0){
                num = i*i*i;
                System.out.print(num +" ");
            }
            i++;
        }
     }
 }
