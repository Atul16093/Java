//  What will be the area of a square with perimeter 200 m?
public class Q31 {
    public static void main(String[] args) {
        //The formula of area of perimeter = 4*area;
        int perimeter = 200;
        int side = 200/4;
        int area_of_square = side*side;
        System.out.println("The area of perimeter is -: "+area_of_square);
    }
}
