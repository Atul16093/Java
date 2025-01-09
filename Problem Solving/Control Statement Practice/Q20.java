//  0	7	14	21	28	35	.....
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking a input
        System.out.print("Enter your n term  -: ");
        int num = sc.nextInt();
        int i = 0;
        int num1 = 0;
        
        while (i<=num) {
            //The difference of between every number is 7 that's why we are increasing +7 every time
            System.out.print(num1+" ");
            num1 +=7;
            i++;
        }
    }
}
