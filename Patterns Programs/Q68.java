/*
1 2 3 4 5 6
 1 _ _ _ 5
  1 _ _ 4 
   1 _ 3
    1 2
     1 */
import java.util.Scanner;
public class Q68{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int row = sc.nextInt();
        int a = row ;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
        for(int k = 1 ; k <=row-i ; k++ ){
            if(k==1 || i==0 || k==row-i){
            System.out.print(k+" ");
           }else{
               System.out.print("_ ");
                }
           }
           System.out.println();
        } 
    }
}