import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length ,breadth;
        System.out.print("Enter the length of the rectangle -: ");
        length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle -: ");
        breadth= sc.nextInt();
        if(length==breadth){
            System.out.println("It's a square");
        }else{
            System.out.println("It's a rectangle");
        }
    }
}