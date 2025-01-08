/*
         *
        *_*
       *___*
      *_____*
     *_______*
      *_____*
       *___*
        *_*
         *
*/
import java.util.Scanner;
class Sum extends Exception{
    public Sum(String s){
        super(s);
    }
}
public class Q76{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        try{
            if(row%2 == 0){
                throw new Sum("Sum value Cann't Supported in this program ");
            }
        int half = row/2;
        int a = 1;
        int b = 0 ;
        int c = 0;
        for(int i = 0 ; i <row ; i++){
            if(half >=i){
              for(int j = 0 ; j < row-i; j++){
                System.out.print(" ");
                }
                // a = i+a;
              for(int k = 0 ; k < i+a ; k++){
                if(k==0 || k==(i+a)-1 ){
                    System.out.print("*");
                }else{
                    System.out.print("_");
                }
              }
                    a++;
                    System.out.println();
            }else if( half <i){
                for(int j = 0 ; j <=(half+1)+b; j++){
                    System.out.print(" ");
                }
                b++;
                for(int k = (half*2-1) ; k >c ; k--){
                    if(k==(half*2-1) || k == (c+1)){
                    System.out.print("*");
                    }else{
                        System.out.print("_");
                    }
                }
                    c =c+2;
                    System.out.println();
            }
          }
        }catch(Sum e){
            System.out.println(e);
        }
    }
}