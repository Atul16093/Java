// How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?
public class Q30 {
    public static void main(String[] args) {
        // floor area
        int l = 200;
        int b = 400;
        int floor_area = l*b;
        //tiles area
        int length = 5;
        int breadth = 8;
        int tiles_area = length*breadth;
        //Number of tiles 
        int number_of_tiles = floor_area/tiles_area;
        System.out.println("The total number of tiles -: "+number_of_tiles);
    }
}
