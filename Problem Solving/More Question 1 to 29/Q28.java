
/*Write a java program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. */
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your total unit of Number -: ");
        float unit = sc.nextFloat();
        float total = 0;
        if (unit < 50) {
            total = unit * 0.50f;
            // After 50 next 100 unit cost 0.75
        } else if (unit <= 150) {
            total = (50 * 0.50f) + ((unit-50) * 0.75f);
        } else if (unit <= 250) {
            total = (50 * 0.50f) + (100* 0.75f) + ((unit-150) * 1.20f);
        } else if (unit > 250) {
            total = (50 * 0.50f) + (100 * 0.75f) + (100 * 1.20f) + ((unit-250) * 1.50f);
        }
        // surcharge 20%
        float surcharge = total * 20 / 100f;
        float total_bill = total + surcharge;
        System.out.println("You total electricity bill is -: " + total_bill);
    }
}
