import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int a = 0;
            for(int i = 1 ; i <=row ; i++){
                for(int j = 1 ; j <=row-i ; j++){
                    System.out.print(" ");
            }
            for(int k = 1 ; k <=i+a ; k++){
                System.out.print("*");
                
            }
            a++;
            System.out.println();
        }
    }
}
