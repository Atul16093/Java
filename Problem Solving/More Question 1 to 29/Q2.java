import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rectangle Length -: ");
        float length = sc.nextFloat();
        System.out.print("Enter the rectangle breadth -: ");
        float breadth = sc.nextFloat();
        float area_Of_Rectangle = (length*breadth);
        System.out.println("The areaa of rectangle is -: " +area_Of_Rectangle);
    }
}
