// WAP to print N even numbers.
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int num = 57;
        int i = 1;
        while (i<=num) {
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
