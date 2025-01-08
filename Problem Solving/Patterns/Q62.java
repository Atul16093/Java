/*
      #
     *#*
    **#**
   ***#***
  ****#****
 *****#*****
 */
import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int a = 0;
        for(int i = 0 ; i <row ; i++){
            for(int j = 0 ; j <row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k <=i+a; k++){
                if(k==a){
                System.out.print("#");
                }else{
                    System.out.print("*");
                }
            }
            a++;
            System.out.println();
        }
    }
}
