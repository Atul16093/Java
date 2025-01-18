/*
Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
two integers
three float
all elements of array
one double and one integer


 */
class MathOperation {
    private int a;
    private int b;
    private float c;
    private float d;
    private double e;
    private int n[];
    private double result;

    public void multiply(int a, int b) {
        this.a = a;
        this.b = b;
        this.result = a * b;
    }

    public void multiply(float c, float d) {
        this.c = c;
        this.d = d;
        this.result = c * d;
    }

    public void multiply(double e, int a) {
        this.e = e;
        this.a = a;
        this.result = e * a;
    }

    public void multiply(int... n) {
        this.n = n;
    }

    public double display() {
        return result;
    }

    public void display1() {
        int a = 1;
        for (int element : n) {
            a = a * element;
        }
        System.out.println(a);
    }
}

public class Q15Test {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        obj.multiply(4, 5, 4, 5);
        obj.display1();
        System.out.println(obj.display());
    }
}
