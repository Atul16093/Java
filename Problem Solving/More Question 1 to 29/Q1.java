import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your circle radius -: ");
        float radius = sc.nextFloat();
        float area_Of_Circle =(float)Math.PI*(radius*radius);
        System.out.println("The area of circle is -: "+area_Of_Circle);
    }
}
