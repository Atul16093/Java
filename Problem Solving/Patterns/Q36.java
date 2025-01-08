/*
A B C D E F
A       E
A     D
A   C
A B
A
 */
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = row ; i >=0; i--){
            char ch = 65;
            for(int j = 0 ; j <=i ; j++){
                if(i==row || i==j || j==0){
                    System.out.print(ch+" ");
                    ch++;
                }else{
                    System.out.print("  ");
                    ch++;
                }
            }
         System.out.println();
        }
    }
}
