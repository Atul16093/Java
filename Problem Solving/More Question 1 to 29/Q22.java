// Write a Java program to check whether a number is divisible by 5 and 11 or not. 
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input the number 
        int numb = sc.nextInt();
        // 45%5==0 
        if(numb%5==0||numb%11==0){
            System.out.println("It's divisible ");
        }else{
            System.out.println("It's not divisible neither 5 nor 11");
        }
    }
}
