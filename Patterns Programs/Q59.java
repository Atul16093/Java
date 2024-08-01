/*
       1
      1 1
     1 2 1
    1 3 3 1
   1 4 4 4 1
  1 5 5 5 5 1
 */
import java.util.Scanner;

public class Q59{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
    for(int i = 0 ; i <row ; i++){
        for(int j = 0 ; j < row-i; j++){
            System.out.print(" ");
        }
      for(int k = 0 ; k <= i ; k++){
        if(k==0 || k==i ){
            System.out.print(" 1");
        }else{
            System.out.print(" "+i);
        }
      }
      System.out.println();
    }
    }
}