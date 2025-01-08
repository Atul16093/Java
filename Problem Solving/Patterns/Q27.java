/*
1
10
1 1
1  0
1   1
101010
 */
import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = 0 ; i <=row ; i++){
            for(int j = 0 ; j <=i ; j++){
                if(j==0 || i==j || i==row){
                    if(j%2==0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
