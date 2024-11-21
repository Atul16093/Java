/*
         *
        *_*
       *_*_*
      *_*_*_*
     *_*_*_*_*
      *_*_*_*
       *_*_*
        *_*
         *
*/
import java.util.Scanner;
public class Q74{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int half = row/2;
        int a = 1, c = 0;
        for(int i = 0 ; i < row ; i++){
            if(half >= i){
                for(int j = 0 ; j < row-i ; j++){
                    System.out.print(" ");
                }
                for(int k = 0 ; k < i+a ; k++){
                    if(k%2==0){
                        System.out.print("*");
                    }else{
                        System.out.print("_");
                    }
                }
                    a++;
                    System.out.println();
            }else if(half <i){
                for(int j =0 ; j <= i ; j++){
                    System.out.print(" ");
                }
                for(int k = (half*2-1) ; k > c ; k--){
                    if(k%2 ==0){
                        System.out.print("_");
                    }else{
                        System.out.print("*");
                    }
                }
                c = c+2;
                System.out.println();
            }
        }
    }
}