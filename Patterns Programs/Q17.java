/*
*
##
***
####
*****
*/
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row -: ");
        int row = 5;
        for(int i = 0 ; i <row ; i++){
            for(int j = 0 ; j<=i; j++){
                if(i%2==0){
                System.out.print("*");
                }else{
                    System.out.print("#");
                    }
                }
             System.out.println();
            }
                
    }
}
