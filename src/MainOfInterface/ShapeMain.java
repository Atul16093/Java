package MainOfInterface;
import Interface.Shape;
import subClassesOfInterface.Circle;
import subClassesOfInterface.Rectangle;
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj = new Circle(45.6);
		Shape obj1 = new Rectangle(56.3 , 12.5);
		obj.calculateArea();
		obj1.calculateArea();
	}

}
