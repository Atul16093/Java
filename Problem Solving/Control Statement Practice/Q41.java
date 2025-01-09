// // WAP to find out LCM of a number
// import java.util.Scanner;

// public class Q41 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number -: ");
//         int num = sc.nextInt();
//         int j = 0;
//         while (num>1) {
//             for(int i = 1; i<=num ;i++){
//                 if(num%2==0){
//                     j = num /i;

//                 }
//                 System.out.println(j);
//             }
//         }
//     }
// }
import java.util.Scanner;

public class Q41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the LCM of the two numbers
        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
                break;
            }
            lcm++;
        }

        // Close the scanner
        scanner.close();
    }
}
