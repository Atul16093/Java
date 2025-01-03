// What is the surface area of a cylinder if the diameter is 15m height is 7m?
public class Q36 {
    public static void main(String[] args) {
        float diameter = 15f;
        float radius = 15f / 2;
        float height = 7;
        float surface_area = (2 * 3.14159f * radius * height) + (2 * 3.14159f * radius * radius);
        System.out.println("The surface area of cylinder is -: "+surface_area);
    }
}
