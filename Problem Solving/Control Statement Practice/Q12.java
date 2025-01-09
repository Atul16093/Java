import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n number -: ");
        int n = sc.nextInt();
        int i = 1;
        while (i<n) {
            //applying a simple if else statement
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
            // i = i+2;
            // System.out.print(i+" ,");
        }
    }
}
