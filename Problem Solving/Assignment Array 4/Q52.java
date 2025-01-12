/*
 12345
  1__4
   1_3
    12
     1
 */
import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = row ; i>0; i--){
            for(int j = 0 ; j <row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1  ; k <=i ; k++){
                if(k==1 || row==i||k==i){
                    System.out.print(k);
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
