import java.util.Scanner;

public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int a = 2;
  
        for(int i = row ; i > 0 ; i--){
            for(int j = row-i ; j > 0 ; j--){
                System.out.print(" ");
            }
            for(int k = (i*2+1)-a ; k>0 ; k--){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}