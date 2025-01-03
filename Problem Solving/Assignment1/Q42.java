// Find the Volume of Cylinder whose diameter and height are 2.25cm
public class Q42 {
    public static void main(String[] args) {
        float diameter = 2.25f;
        float height = 2.25f;
        float radius = diameter/2;
        //volume of cylinder 
        double volume = Math.PI * radius * radius * height;
        System.out.println("the volume of cylinder is -: "+volume);
    }
}
