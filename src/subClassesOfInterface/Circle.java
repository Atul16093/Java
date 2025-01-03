package subClassesOfInterface;
import Interface.Shape;
public class Circle implements Shape {
	double r;
	public Circle() {}
	public Circle(double r) {
		this.r = r;
	}
	public void calculateArea() {
		double area = Math.PI * r *r;
		System.out.printf("The area of circle is : %.2f\n", area);
	}
}
