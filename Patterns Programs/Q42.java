/*
54321
5432
543
54
5
*/
import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number of row -: ");
     int row = sc.nextInt();
     for(int i = 1; i <=row ; i++){
        for(int j = row ; j >=i ; j-- ){
            System.out.print(j);
        }
        System.out.println();
     }
    }
}
