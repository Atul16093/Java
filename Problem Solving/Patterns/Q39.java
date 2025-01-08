/*
123456
54321
1234
321
12
1
 */
import java.util.Scanner;

public class Q39{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of row -: ");
      int row = sc.nextInt();
      for(int i = row ; i >=1 ; i--){
        for(int j = 1 ; j <=i ; j++){
            if(i%2==0){
                System.out.print(j);
            }else {
                for(int k = i ; k >=1 ; k--){
                    System.out.print(k);
                }
                break;
            }
        }
        System.out.println();
      }
    }
}