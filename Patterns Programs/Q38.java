import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        // Check number it's Armstrong or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number -: ");
        //firstly we are taking a input from the user 
        int num = sc.nextInt();
        int num2 = num;
        int original_num = num;
        //creating multiple variable accoring to our need we use it
        int n = 0, store = 0, count = 0;
        //This loop help us to counting the number of digits
        while (num2>0) {
            n = num2%10;
            num2 /=10;
            count++;
        }  
        //This loop giving a reminder and inner loop is calculate and make a square
        while (num > 0) {

            n = num % 10;
            // here we are creating a square of each number
            int power = 1 ;
            for(int i =0;i<count;i++){
                power *= n;
            }
            num /= 10;
            // adding each number square every time
            store += power;
            System.out.println(store);
        }
        if (original_num == store) {
            System.out.println("It's a ArmStrong number ");
        } else {
            System.out.println("It's not a ArmStrong number ");
        }
    }
}
