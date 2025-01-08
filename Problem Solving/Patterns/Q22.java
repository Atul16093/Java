/*
A
AB
A C
A  D
A   E
ABCDEF
 */
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = 0; i<=row ; i++){
            char ch = 65;
            for(int j = 0 ; j<=i ; j++){
                if(j==0||i==j||i==row){
                System.out.print(ch);
                ch++;
                }else{
                    System.out.print(" ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
