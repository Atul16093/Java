import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n number -: ");
        int n = sc.nextInt();
        int i = 1;
        while (i<=n) {
            for(int j=1;j<=i;j++){
                System.out.print(9);
            }
            System.out.print(" ");
            i++;
        }
    }
}
