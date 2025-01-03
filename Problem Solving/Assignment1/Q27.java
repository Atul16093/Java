// Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m.
public class Q27 {
    public static void main(String[] args) {
        int l = 20;
        int b = 15;
        int area = l*b;
        //cost of tiling  
        int costOfTiling = 5;
        int cost = area*costOfTiling;
        System.out.println("The cost of tiling is $"+cost);
    }
}
