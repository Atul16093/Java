/*
a
bc
def
ghij
klmno
pqrstu */
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows -: ");
        int  n = sc.nextInt();
        char ch = 97;
        for(int i = 0  ;  i <=n ; i++){
            for(int j = 0 ; j <=i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
