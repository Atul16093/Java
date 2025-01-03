// The area of a right triangle is 184 cm² and one of its legs is 16 cm long. Find the length of other leg.
public class Q13 {
    public static void main(String[] args) {
        double area = 184;
        double base = 16;
        double height = 0;
        /* Area = 1/2*base*height;
           184 = 1/2*16*height;
           184 = 8 * height;
           height = 184/8;
           ans = 23;*/
        height = area / (1.0f/2 *base);
        System.out.println(height);
    }
}
