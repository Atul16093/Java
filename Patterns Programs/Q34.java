import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        char ch = 69;
        for(int i = row ; i>0 ; i--){
            for(int j = 0 ; j <i ; j++){
                System.out.print(ch);
            }
            ch--;
            System.out.println();
        }
    }
}
