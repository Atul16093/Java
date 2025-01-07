// W.A.P to check whether a charachter is an alphabet or not.
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character -: ");
        char ch = sc.next().charAt(0);
        //for unicode the char 65  = A ,  96= Z, 97=a  122=z
        if(ch>64&&ch<=122){
            System.out.println("It's a alphabet");
        }else{
            System.out.println("It's not a alphabet");
        }
    }
}
