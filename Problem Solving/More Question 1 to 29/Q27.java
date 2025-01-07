
/*Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95% */
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary -: ");
        int bs = sc.nextInt();
        int HRA = 0;
        int DA = 0;
        int total = 0;
        if (bs <= 10000) {
            HRA = bs * 20 / 100;
            DA = bs * 80 / 100;

        } else if (bs <= 20000) {
            HRA = bs * 25 / 100;
            DA = bs * 90 / 100;
        } else if (bs > 20000) {
            HRA = bs * 30 / 100;
            DA = bs * 95 / 100;
        }
        total = bs + HRA + DA;
        System.out.println("The Gross salary is -: " + total);
    }
}
