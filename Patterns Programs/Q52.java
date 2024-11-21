/*
       1
      1 2
     1 2 3
    1 2 3 4
   1 2 3 4 5
  1 2 3 4 5 6
 */
import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int a = 1;
        for(int i = row ; i >=1 ; i--){
            for(int j = 1 ;  j <=i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=a; k++){
                System.out.print(" "+k);
            }
            a++;
            System.out.println();
        }
    }
}
