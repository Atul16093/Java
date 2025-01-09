import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n number -: ");
        int n = sc.nextInt();
        int i = 1;
        while (i<=n) {
           for(int j = 0 ; j<i;j++) {
            System.out.print(1);
           }
           System.out.print(" ");
           i++;
        }
    }
}
