// Find the sum kof 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .
import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
        int first_term = -21;
        int current_term = first_term;
        int sum = 0;
        for(int i =0; i<term;i++){
            current_term += 3;
            sum +=current_term;

        }
        System.out.println(sum);
    }
}
