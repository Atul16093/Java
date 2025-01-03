// The surface of the cylinder is 149 cm². The cylinder height is 6 cm. What is the diameter of this cylinder?
public class Q37 {
    public static void main(String[] args) {
        // we need diameter of the cylinder
        float height = 6;
        float cylinder_area = 149;
        float radius = (2 * 3.14159f * height )+(2*3.14159f);
        float diameter = radius * 2;
        System.out.println("The diameter of the cylinder is -: "+diameter);
    }
}
