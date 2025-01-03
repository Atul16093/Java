//  Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters.
public class Q39 {
    public static void main(String[] args) {
        int diameter = 12;
        int height = 9;
        //firstly we need the radius 
        int radius = diameter/2;
        //Suraface of the cylinder 
        double surface_area = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
        System.out.println("The surface area of the cylinder is -: "+surface_area);
    }
}
