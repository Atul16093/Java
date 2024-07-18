import java.util.Scanner;

public class Q1_Star_In_Single_Row {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of star -: ");
        int n = sc.nextInt();
        for(int i = 0 ; i <= n ; i++ ){
            System.out.print("* ");
        }
    }
}
