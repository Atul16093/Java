//  A carpet is 5 m long and 4 m wide. Find its price at the rate of $ 205 per square meter.
    
public class Q28 {
    public static void main(String[] args) {
        int l = 5;
        int b = 4;
        int area = l * b;
        // The cost of per meter is
        int costofpermeter = 205;
        int cost = area * costofpermeter;
        System.out.println(cost);
    }
}
