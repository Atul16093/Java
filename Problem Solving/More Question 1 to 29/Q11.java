import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number -: ");
        int number = sc.nextInt();
        switch (number%2) {
            case 0:
                System.out.println("Number is even");
                break;
            case 1:
            System.out.println("Number is odd");
            break;
            default:
            System.out.println("Invalid input");
                break;
        }
    }
}
