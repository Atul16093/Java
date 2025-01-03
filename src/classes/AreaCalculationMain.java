package classes;
/* Shape Area Calculation
Create a parent class Shape with a method calculateArea() that prints "Area calculation not defined for Shape."
Create subclasses:
Circle that overrides calculateArea() to calculate and print the area of a circle.
Rectangle that overrides calculateArea() to calculate and print the area of a rectangle.
Write a Main class to demonstrate polymorphism using an array of Shape objects*/
import java.util.Scanner;
class Shape{
	void calculateArea() {
		System.out.println("Area calculation not defined for Shape.");
	}
}
class Circle extends Shape{
	private double radius ;
	public Circle() {
		
	}
	public Circle(double r ) {
		this.radius = r;
	}
	void calculateArea() {
		double result = Math.PI * radius * radius;
		System.out.printf("The area of circle is : "+"%.2f \n",result);
	}
}
class Rectangle extends Shape{
	private double length ; 
	private double width;
	public Rectangle() {
		
	}
	public Rectangle(double l , double w) {
		this.length = l;
		this.width  = w;
	}
	void calculateArea() {
		double result = length * width;
		System.out.printf("The area of rectangle is : "+"%.2f \n",result);
	}
}
public class AreaCalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		double radius = sc.nextDouble();
		System.out.println("Enter the length of the rectangle : ");
		double l = sc.nextDouble();
		System.out.println("Enter the width of the rectangle : ");
		double w = sc.nextDouble();
		Shape arr[] = new Shape[2];
		arr[0] = new Circle(radius);
		arr[1] = new Rectangle(l , w);
		
		arr[0].calculateArea();
		arr[1].calculateArea();
	}

}
