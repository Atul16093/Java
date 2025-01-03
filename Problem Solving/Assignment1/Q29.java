// How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?
public class Q29 {
    public static void main(String[] args) {
        //floor area
        int length = 800;
        int breadth = 900;
        int area  = length * breadth;
        //area of tile 
        int side = 10;
        int area_of_tile = side*side;
        int total_number = area/area_of_tile;
        System.out.println("The total number of tile required is "+total_number);
    }
}
