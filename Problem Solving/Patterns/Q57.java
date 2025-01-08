import java.util.Scanner;

public class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int a = 1;
        for(int i = 0 ; i<row; i++){
            char ch = 'A';
            for(int j = 0 ; j<row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i+a; k++){
                System.out.print(ch);
                ch++;
            }
            a++;
        System.out.println();
        }
    }
}
