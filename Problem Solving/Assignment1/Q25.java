// 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden. What is the area of the path?
public class Q25 {
    public static void main(String[] args) {
        int length = 24;
        int breadth = 15;
        //area of garden 
        //it's a one brick area 
        int area = length*breadth;
        //total area is 
        int total = area *100;
        System.out.println("The total area of garden is -: "+total+"cm²");
    }
}
