// Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.

public class Q33 {
    public static void main(String[] args) {
        float radius = 7.7f;
        float height = 12;
        //surface area of cylinder 
        //surface area = 2*3.14159*radius*height + 2*3.14159*radius*radius;
        float surface_area = (2*3.14159f*radius*height) +( 2*3.14159f*radius*radius);
        System.out.println("Surface area of cylinder is -: "+surface_area);
    }
}
