// import java.util.Scanner;

// public class Q43 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a decimal number -: ");
//         int decimal = sc.nextInt();
//         int binary = 0;
//         while (decimal > 0) {
//             int reminder = decimal % 2;
//             binary = binary * 10 + reminder;
//             decimal /=  2;
//         }
//         System.out.print(binary);
//     }
// }
import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int binary = 0; // Initialize binary as 0

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = binary * 10 + remainder; // Concatenate the binary digits
            decimal /= 2;
        }

        // Reverse the binary representation
        int reversedBinary = 0;
        int base = 1; // Initialize base for place value

        while (binary > 0) {
            int digit = binary % 10;
            reversedBinary += digit * base;
            base *= 2; // Update base for next place value
            binary /= 10;
        }

        System.out.println("Binary representation: " + reversedBinary);
    }
}
