import java.util.Scanner;

public class Q6_Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first nubmer -: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number -:");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is greater");
        } else if (a == b) {
            System.out.println("both nubmer are equal");
        } else {
            System.out.println("b is greater");
        }
    }
}