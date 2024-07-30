/*
    A
   AB
  ABC
 ABCD
ABCDE
 */
import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            char ch = 65;
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
