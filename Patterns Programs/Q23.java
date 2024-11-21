import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        char ch = 97;
        for(int i = 0 ; i <=row ; i++){
            for(int j = 0 ; j <=i ; j++){
                if(j==0 || i==j || i==row){
                    System.out.print(ch);
                    ch++;
                }else{
                    System.out.print(" ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
