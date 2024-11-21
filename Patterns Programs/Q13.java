/*
1
01
101
0101
10101
*/
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows -: ");
        int row = sc.nextInt();
        for(int i = 0 ; i < row ; i++ ){
            for(int j = 0 ; j <= i ; j++){
              int sum  = i+j;
              if(sum%2==0){
                System.out.print("1");
              }else{
                System.out.print("0");
              }
            }
            System.out.println();
        }
        
    }
}
