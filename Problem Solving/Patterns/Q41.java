/*
A
B C D
E F G H I
J K L M N O P
Q R S T U V W X Y
 */
import java.util.*;
public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        char ch = 65;
        int a = 0;
        for(int i = 1 ; i<=row ; i++){
            for(int j = 0 ; j <i+a; j++){
                System.out.print(ch+" ");
                ch++;
            }
            a++;
            System.out.println();
        }
    }
}
