// WAP to check whether entered number is strong or not
import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Writing a program for checking strong number
        System.out.print("Enter the number");
        int num = sc.nextInt();
        int original_num = num;
        int n = 0  , sum=0;
        while (num>0) {
            n = num%10;
            int factorial  =1;
            for(int i =n ;i>=1;i--){
                factorial = factorial*i;
            }
            sum +=factorial;
            
            num /=10;
        }
        System.out.println(sum);
        if(original_num == sum){
            System.out.println("It's a strong number");
        }else {
            System.out.println("It's not a strong number ");
        }
    }
}
