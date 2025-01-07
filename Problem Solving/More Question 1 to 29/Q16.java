import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter input for celcius press c or C and for ferhanite press f F -: ");
        char ch = sc.next().charAt(0);
        // for converting into ferhanite
        if (ch == 'f' || ch == 'F') {
            System.out.print("Enter tempreture in celcius -: ");
            int temp = sc.nextInt();
            /* formula -: Ferhanite = celcius * 9 / 5 + 32 */
            int ferhanite = temp * 9 / 5 + 32;
            System.out.println("The converted tempreture into celcius to ferhanite is -: " + ferhanite);
             // for converting into celcius
        } else if (ch == 'C' || ch == 'c') {
            System.out.print("Enter tempreture in ferhanite -: ");
            int temp = sc.nextInt();
            int celcius = (temp - 32) * 5 / 9;
            System.out.println("The celcius tempreture is -: " + celcius);
        } else {
            System.out.println("Invalid input");
        }
    }
}
