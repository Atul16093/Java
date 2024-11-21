/*    
         *
        ***
       *****
      *******
     *********
      *******
       *****
        ***
         *
*/
import java.util.Scanner;
public class Q75{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of row -: ");
        int row = sc.nextInt();
        int half = row/2;
        int a = 1;
        int b =half+1;
        int c = 0;
        for(int i = 0 ; i <row ; i++){
            if(half >= i ){
            for(int j = 0 ; j<row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k < i+a ; k++){
                System.out.print("*");
            }
            a++;
            System.out.println();
        }else if(half <i) {
            for(int j =0 ; j <=b ; j++){
            System.out.print(" ");
            }
            b++;
            for(int k = (half*2-1) ; k >c ; k--){
                System.out.print("*");
            }
            c=c+2;
            System.out.println();
           }
        }
    }
}