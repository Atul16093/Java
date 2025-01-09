import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your n term -: ");
        int n = sc.nextInt();
        int n1 = 1 , n2 = 2 , n3 ;
        int i = 0;
        while (i<n) {
         n3 = n1*n2;
         System.out.print(n3 +" ,");
         n1 = n2;
         n2 = n3;
         i++;
        }
    }
}
