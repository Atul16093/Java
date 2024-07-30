/*
     1
    11
   1*1
  1**1
 11111
 */
import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0 ; i <row ; i++){
            for(int j = 0 ; j <row-i; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k <=i ; k++){
                if (k == 0 || k == i || i == row - 1){
                System.out.print("1");
              }else{
                System.out.print("*");
              }                           
            }
            System.out.println();
        }
    }
}
