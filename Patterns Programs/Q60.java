/*
     1
    1*1
   1***1
  1*****1
 1*******1
11111111111
 */
import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int a = 0;
        for(int i = 1 ; i <=row ; i++){
            for(int j = 1 ; j <=row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i+a ; k++){
                if(k==1 || k==i+a || i==row){
                System.out.print("1");
                }else{
                    System.out.print("*");
                }
            }
            a++;
            System.out.println();
        }
    }
}
