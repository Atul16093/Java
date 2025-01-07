// W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter left side -: ");
        int left =sc.nextInt();
        System.out.print("Enter Right side -: ");
        int right = sc.nextInt();
        System.out.print("Enter bottom side -: ");
        int bottom = sc.nextInt();
        if(left==right||left==bottom||right==bottom){
            System.out.println("The triangle is isosceles triangle");
            //Equilateral triangle has three side are equal
            //  The logic is behind that if left equal to right so also right equal to bottom
        }else if(left==right&&right==bottom){
            System.out.println("It's a equilateral triangle");
        }else{
            System.out.println("It's a scalene triangle");
        }
    }
}
