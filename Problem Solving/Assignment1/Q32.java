//  A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden.
public class Q32 {
    public static void main(String[] args) {
        //area of garden
        int side = 150;
        int area = side*side;
        //area of swimming pool
        int pool_side = 25;
        int pool_area = pool_side*pool_side;
        //The area of garden after minus the area of swimming pool is
        int remaming_garden_area = area - pool_area;
        System.out.println("The remaming garden area after minus the swimming pool is -: "+remaming_garden_area+"m²");

    }
}
