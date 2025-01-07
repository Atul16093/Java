// Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Check the triangle is valid or not 
        System.out.print("Enter the first side of the triangle -: ");
        int angle1 = sc.nextInt();
        System.out.print("Enter the second side of the triangle -: ");
        int angle2 = sc.nextInt();
        System.out.print("Enter bottom side of the trianle -: ");
        int angle3 = sc.nextInt();
        if(angle1+angle2+angle3 ==180){
            System.out.println("It's a valid triangle");
        }else{
            System.out.println("It's not a valid triangle");
        }
        // Check by switch case
        int value = angle1+angle2+angle3 ;
        switch (value) {
            case 180:
                System.out.println("It's a valid triangle");
                break;
                default:
                System.out.println("It's not a valid triangle");
               
        }
    }
}
