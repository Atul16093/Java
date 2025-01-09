//  ...... -6	-3	0	3	6	9	....... n terms	 

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // taking input
        System.out.print("Enter your n term -: ");
        int num = sc.nextInt();
        int i = 0;
        int p = -9;
        while (i < num) {
            p += 3;
            System.out.print(p+", ");
            i++;
           
        }
    }
}
