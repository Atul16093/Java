public class Q6_Q10 {
    public static void main(String[] args) {
        // float a = 10f;
        // float b = 9f;
        // float parameter = 36;
        // float c = parameter-(a+b);
        // float area = a*b/2;
        // System.out.println(area);
        // Question no 7
        /*
         * float base = 50f;
         * float area = 500f;
         * // Area = 1/2*base*height;
         * // height = 2A/base
         * 
         * float height =2*500/50;
         * System.out.println(height);
         */
        // Question no 8
        // base = ?
        float altitude = 20f;
        float area = 0.8f;
        // in 1 meter = 100cm *100cm
        float area_to_centimeter = 0.8f * 10000;
        float base = (2 * area_to_centimeter) / 20;
        System.out.println(base);
        // Question no 9
        // Height of equilateral triangle is 12cm
        // Formula area = 3*3/4*length;
        double length = 12;
        double area_equilateral = ((Math.sqrt(3))/4)*length*length;
        System.out.println(area_equilateral);

        //Q 10
        float sides = 15f;
        float area_Of_Triangle = (1.0f/2)*(sides*sides);
        System.out.println(area_Of_Triangle);
    }
}
