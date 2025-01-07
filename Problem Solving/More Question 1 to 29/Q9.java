import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Number -: ");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("Number is positive");
        }else if (number==0){
            System.out.println("Neither is positive nor negative it's a neutral");
        }else{
            System.out.println("It's a negative number");
        }
    }
}
