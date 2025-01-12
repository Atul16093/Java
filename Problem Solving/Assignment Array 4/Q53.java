/*
 55555
  4__4
   3_3
    22
     1
 */
import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = row ; i >0 ; i--){
            for(int j = 0 ; j <row-i; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i ; k++){
                if(k==1 || row==i || k==i){
                    System.out.print(i);
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
