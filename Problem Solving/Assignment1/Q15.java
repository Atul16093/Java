// Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?
public class Q15 {
    public static void main(String[] args) {
        // The area of Shelly Garden is -:
        int length = 22;
        int breadth = 15;
        int Area_Rectangle = length * breadth;
        System.out.println("The shelly garden area is " + Area_Rectangle + "m");
        // Rachel garden area
        int side = 21;
        int area_Square = side * side;
        System.out.println("The rachel garden area is -: " + area_Square + "m");
        if (Area_Rectangle > area_Square) {
            System.out.println("Shelly garden is bigger than rachel " + (Area_Rectangle - area_Square) + "m");
        } else {
            System.out.println("Rachel garden is bigger than shelly -: " + (area_Square - Area_Rectangle) + "m");
        }
    }
}
