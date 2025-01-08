/*
A
AB
ABC
ABCD
ABCDE
*/
import java.util.Scanner;

public class Q11_Left_Align_Triangle_ABCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            char ch = 65;
            for(int j = 0 ; j <=i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
