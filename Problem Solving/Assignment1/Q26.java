// How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?

public class Q26 {
    public static void main(String[] args) {
        //total area 
        float l =120;
        float b = 2.4f;
        float area = l*b;
        //converting meter into centimeter 
        int centimeter = 100*100;
        area = area*centimeter;
        //area of brick 
        int length = 24;
        int breadth = 15;
        int area_of_brick= length*breadth;
        //Now calculate the total number of bricks
        float total_bricks = area/area_of_brick;
        System.out.println("The total number of bricks required is -: "+total_bricks);
    }
}
