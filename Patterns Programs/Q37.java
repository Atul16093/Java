import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original_num = num;
        int reverse = 0 , reminder;
        while (num!=0) {
            reminder = num%10;
            reverse = reverse*10 +reminder;
            num /=10;
        }
        System.out.println(reverse);
       if(original_num==reverse){
        System.out.println("It's a palindrome");
       }else{
        System.out.println("It's not a palindrome");
       }
    }
}
