// A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?
public class Q21 {
    public static void main(String[] args) {
        //Firstly we take volume of one bricks 
        int l = 15;
        int b = 8;
        int h = 5;
        int volume_brick = l*b*h;
        System.out.println("The volume of single brick is -: "+volume_brick);
        // Now the volume of wall is 
        int length = 15;
        int breadth = 10;
        int height = 8;
        int volume_wall = length*breadth*height;
        //volume in centimeter
        int centimeter = 100*100*100;
        int volume_centimeter = volume_wall*centimeter;
        System.out.println(volume_centimeter);
        //Now how many bricks we need 
        int number_bricks = volume_centimeter/volume_brick;
        System.out.println("The total number of bricks is -: "+number_bricks);
    }
}
