import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number -: ");
        int input = sc.nextInt();
        int i = 1;
        while (i<=input) {
            if(i%5==0){
                System.out.print("Hello ");
            }else{
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
