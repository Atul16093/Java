/*
      X
     X_X
    X___X
   X_____X
  X_______X
 X X X X X X
 */
import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1 ; i <=row ; i++){
            for(int j = 1 ; j <=row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i ; k++){
                if(k==1 || i==row){
                System.out.print(" X");
            }else if(k==i){
                System.out.print("_X");
            }
            else{
                System.out.print("__");
            }
        }
        System.out.println();
       }
    }
}