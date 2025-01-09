import java.util.Scanner;

public class Q22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n -: ");
        int n = sc.nextInt();
        int i = 1;
        int num =1;
        while (i<=n) {
            num = i*i*i;
            System.out.print(num+",");
            i++;
        }
        }
    }
