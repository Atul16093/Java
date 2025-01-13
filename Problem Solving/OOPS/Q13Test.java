/*
Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
init - to input radius from user
calc - to calculate area
display- to display area
 */

import java.util.Scanner;

class Area_Circle{
    private double radius;
    private double value;
    public void init(double radius){
        this.radius = radius;
    }
    public void calc(){
        this.value = Math.PI*radius*radius;
    }
    public double display(){
        return value;
    }
}
public class Q13Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Area_Circle a1 = new Area_Circle();
        a1.init(radius);
        a1.calc();
        System.out.println(a1.display());   
    }
}
