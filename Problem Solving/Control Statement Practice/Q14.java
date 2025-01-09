// WAP to print alphabets in uppercase

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        char ch = 64;
        int i = 1;
        while (i<=26) {
            ch++;
            if(ch==96){
                System.out.print(ch);
            }else{
                System.out.print(ch+", ");
            }
            i++;
        }
    }
}
