// The length of one of the diagonals of a field in the form of a quadrilateral is 46 m. The perpendicular distance of the other two vert  ices from the diagonal are 13 m and 10 m, find the area of the field.
public class Q14 {
    public static void main(String[] args) {
        /*
         * Area = 1/2 * diagonals * (h1 + h2);
         */
        double d = 46;
        double h1 = 13;
        double h2 = 10;
      double  Area = 1.0f/2 * d * (h1 + h2);
      System.out.println("The are of the field is -: "+Area);
    }
}
