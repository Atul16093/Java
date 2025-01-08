/*
 *    A
     B_B
    C___C
   D_____D
  E_______E
 F F F F F F
 */
import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        char ch = 'A';
        for(int i = 1 ; i<=row ; i++){
            for(int j = 1 ; j <= row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i ; k++){
                if(k==1 || i==row){
                System.out.print(" "+ch);
            }else if(k==i){
                System.out.print("_"+ch);
            }
            else{
                System.out.print("__");
            }
        }
            ch++;
            System.out.println();
        }
    }
}
