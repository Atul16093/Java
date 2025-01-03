// The cylinder has a volume of 1287. The base has a radius 10. What is the area of the surface of the cylinder?
public class Q38 {
    public static void main(String[] args) {
        int volume = 1287;
        int radius = 10;
        //let's break the formula according to our requirment
        double h = volume/(Math.PI*radius*radius);
        //surface area of the cylinder 
        double surface_area = (2 * Math.PI * radius * h ) + (2* Math.PI * radius *radius);
        System.out.println("The surface area of the cylinder is -: "+surface_area);
    }
}
