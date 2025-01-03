//  Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm. Find the length of the other side.
public class Q12 {
    public static void main(String[] args) {
      
        double area;
        int hy = 13 , per = 12 ;
        double base;
        base = Math.sqrt((hy*hy)-(per*per));
        System.out.println(base);
        area = 1.0f/2*base*per/2;
        System.out.println(area);

       }
    }
