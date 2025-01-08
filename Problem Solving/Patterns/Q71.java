/*
1
12
123
1234
1234
123
12
1 */
import java.util.Scanner;
public class Q71{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt() ;
        int half = row/2 ; 
        for(int i = 1 ; i <= row ; i++){
            int num = 1 ;
            if(half >= i ){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
              }
            }else if(half < i){        
                for(int j = row-i ; j >=1 ; j--){
                System.out.print(num);
                num++;
                }
            }
            System.out.println();
        }
    }
}