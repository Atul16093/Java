/*
7 7 7 7 7 7 7
 6 6 6 6 6 6
  5 5 5 5 5
   4 4 4 4 
    3 3 3
     2 2
      1
 */
import java.util.Scanner;
public class Q67{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int a = row ;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
        for(int k = a ; k > 0 ; k-- ){
            System.out.print(a+" ");
           }
           a--;
           System.out.println();
        }
    }
}