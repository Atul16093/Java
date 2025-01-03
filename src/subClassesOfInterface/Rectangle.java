package subClassesOfInterface;

import Interface.Shape;

public class Rectangle implements Shape {
	double l ; 
	double w ;
	public Rectangle() {
		
	}
	public Rectangle(double l , double w) {
		this.l = l ;
		this.w = w;
	}
	@Override
	public void calculateArea() {
		double area = l * w ; 
		System.out.printf("The area of rectangle is : %.2f\n",area);
	}
}
