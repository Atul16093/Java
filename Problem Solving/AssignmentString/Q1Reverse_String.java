
//  Write a java program to reverse each word of String.
import java.util.Scanner;

class Reverse {
    public static void reverse_Array(String s) {
        char ch[] = s.toCharArray();
        char space = ' ';
        String [] word = s.split(" ");
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == space ) {
                for (int j = i; j >= 0; j--) {
                    System.out.print(ch[j]);
                }
            }
        }
     }
}

public class Q1Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string -: ");
        String s = sc.nextLine();
        Reverse.reverse_Array(s);
    }
}
