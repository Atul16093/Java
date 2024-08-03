/*
1 2 3 4 5 6 7 8 9
 1 + + + + + + 8
  1 + + + + + 7
   1 + + + + 6
    1 + + + 5
     1 + + 4
      1 + 3
       1 2
        1
*/
import java.util.Scanner;
public class Q69{
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
               System.out.print("+ ");
                }
           }
           System.out.println();
        } 
    }
}