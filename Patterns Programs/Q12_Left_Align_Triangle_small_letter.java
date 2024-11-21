/*
a
ab
abc
abcd
abcde
abcdef
*/
import java.util.Scanner;

public class Q12_Left_Align_Triangle_small_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        char ch = 97;
        char original_ch = ch;
        for(int i = 0 ; i < row ; i++){
             ch = original_ch;
            for(int j = 0 ; j <=i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
