// WAP to print a statement 1000 number of times.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  -: ");
        int numb = sc.nextInt();
        int i=0;
        while(i<=numb){
            System.out.print("Welcome ");
            i++;
        }
    }
}
