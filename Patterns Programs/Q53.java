/*
       A
      A B
     A B C
    A B C D
   A B C D E
  A B C D E F
 */
import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int a = 1;
        for(int i = row ; i >=1 ; i--){
            char ch = 'A';
            for(int j = 1 ;  j <=i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=a; k++){
                System.out.print(" "+ch);
                ch++;
            }
            a++;
            System.out.println();
        }
    }
}
