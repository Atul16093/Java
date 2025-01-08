/*
55555
4444
333
22
1
 */
import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of row -: ");  
      int row = sc.nextInt();
    for(int i = row ; i >0 ; i--){
        //j<i ---> 0<5;
        for(int j = 0 ; j<i; j++){
            System.out.print(i);
        }
        System.out.println();
    }
    }
}
