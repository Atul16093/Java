/*Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
Percentage >= 90% : Grade A 
Percentage >= 80% : Grade B 
Percentage >= 70% : Grade C 
Percentage >= 60% : Grade D 
Percentage >= 40% : Grade E 
Percentage < 40% : Grade F*/
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your physics marks - ");
        int p = sc.nextInt();
        System.out.print("Enter your Chemistry marks - ");
        int c = sc.nextInt();
        System.out.print("Enter your Biology marks - ");
        int b = sc.nextInt();
        System.out.print("Enter your Mathematics marks - ");
        int m = sc.nextInt();
        System.out.print("Enter your Computer marks - ");
        int comp = sc.nextInt();
        int total = p + c + b + m + comp;
        float precent = total * 100 / 500.f;
        System.out.println("Your precentage is -: " + precent);
        if (precent >= 90) {
            System.out.println("Congratulation ! Your grade is A ");
        } else if (precent >= 80) {
            System.out.println("Good Your grade is B");
        } else if (precent >= 70) {
            System.out.println("Your grade is C");
        } else if (precent >= 60) {
            System.out.println("Your grade is D");
        } else if (precent >= 40) {
            System.out.println("Your grade is E");
        } else {
            System.out.println("Sorry to say you have fail");
        }
    }
}
