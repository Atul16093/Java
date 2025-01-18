/*
Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
init - to input X and Y from user
add - to add X and Y and store in R
multiply - to multiply X and Y and store in R
power - to calculate X Y and store in R
display- to display Result R
 */

import java.util.Scanner;

class MathOperation {
    private double x;
    private double y;
    private double r;

    public void init(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void add() {
        this.r = x + y;
    }

    public void multiply() {
        this.r = x * y;
    }

    public void power() {
        this.r = Math.pow(x, y);
    }

    public double display() {
        return r;
    }
}

public class Q14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MathOperation obj = new MathOperation();
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    obj.init(x , y);
    obj.power();
    double result = obj.display();
    System.out.println(result);
    }
}
