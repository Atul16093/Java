public class Q4 {
    public static void main(String[] args) {
        // Swap value by bitwise operator
        int a = 10;
        int b = 20;
        System.out.println("The value before swapping a  is -: " + a + " and the value of b is -: " + b);
        // Using Bitwise XOR operator
        a = a ^ b;
        b = a ^ b;
        System.out.println("The value of after swapping a  is -: " + a + " and the value of b is -: " + b);
        // Swap value by third variable
        int m = 30;
        int n = 40;
        System.out.println("The value before swapping m is -: " + m + " and n is " + n);
        int temp = m;
        m = n;
        n = temp;
        System.out.println("The value after swapping m is -: " + m + " and the n is " + n);
    }
}
