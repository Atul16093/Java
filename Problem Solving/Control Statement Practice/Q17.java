import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n term -: ");
        int n = sc.nextInt();
        int i = 0;
        int num = 1;
        while(i<n){
            num +=i;
            System.out.print(num+",");
            i++;
        }
    }
}
