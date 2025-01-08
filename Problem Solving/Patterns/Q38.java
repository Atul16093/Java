import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        for(int i = row ; i >=0 ; i--){
            for(int j = 0 ; j <=i ; j++ ){
                if(i==row || i==j || j==0){
                    System.out.print(i+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
