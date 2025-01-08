/*
     1
    10
   101
  1010
 10101
 */
import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = 0  ; i <row ; i++){
            for(int j = 0 ; j <row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k <=i ; k++){
                if(k%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
