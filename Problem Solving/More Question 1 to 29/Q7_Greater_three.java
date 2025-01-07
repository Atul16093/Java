import java.util.Scanner;

public class Q7_Greater_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first nubmer -: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number -:");
        int b = sc.nextInt();
        System.out.print("Enter the third number -: ");
        int c = sc.nextInt();
        int greater = a;
        if (b>greater) {
             greater = b;
        }else if(c>greater){
            greater = c;
        }
        System.out.println("The greater number is -: "+greater);
    }
}
