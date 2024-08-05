/*
    1
   12
  123
 1234
12345
 1234
  123
   12
    1 */
import java.util.Scanner;
class Do_Not_Pass_Sum extends Exception{
    public Do_Not_Pass_Sum(String s){
        super(s);
    }
}
public class Q72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
            try{
           if(row%2 != 0){
                 int a = row/2 ;
            int l = 1 ;
          for(int i = 1 ; i <= row ; i++){
            if(i <= a){
            for(int j = 1 ; j <= a-i ; j++){
                System.out.print(" ");
                   }
            }else{
            for(int k = 1 ; k <= l  ; k++ ){
                System.out.print(" ");
                }
                l++;
             }
             if(i <= a){
                for(int k = 1 ; k <= i ; k++ ){
                    System.out.print(k);
                  }
                }else{
                    int b = 1; 
                for(int k = i ; k <row-1 ; k++){
                System.out.print(b);
                   b++;
                 }
             }
        System.out.println();
        }
           }else{
            throw new Do_Not_Pass_Sum("You cann't pass sum in this programe");
           }
        } catch(Do_Not_Pass_Sum e){
                System.out.print(e);
               }
       
    }
}
