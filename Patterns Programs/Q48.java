 /*
      A
     AB
    A_C
   A__D
  A___E
 ABCDEF */
import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            char ch = 65;
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i || i == row - 1) {
                    System.out.print(ch);
                    ch++;
                } else {
                    System.out.print("_");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
