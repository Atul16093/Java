import java.util.Scanner;

public class Q8_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number-: ");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
