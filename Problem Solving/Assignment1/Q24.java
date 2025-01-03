// How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall?
public class Q24 {
    public static void main(String[] args) {
        //First volume of bricks 
        float l =25.f;
        float b = 10.f;
        float h = 7.5f;
        float volume_bricks = l*b*h;
        //Wall volume 
        float length = 20f;
        float height = 2f;
        float breadth = 0.75f;
        float volume_wall = length*breadth*height;
        // convert meter into centimeter 
        float centimeter = 100 * 100 * 100;
        float volume_in_centimeter = volume_wall*centimeter;
        //Total number of bricks 
        float brick = volume_in_centimeter/volume_bricks;
        System.out.println(brick);
        //The total money on the brick
        float costperthousandbricks = 900f;
        float total =(brick/1000f)*costperthousandbricks;
        System.out.println("Total money $"+total);
    }
}
