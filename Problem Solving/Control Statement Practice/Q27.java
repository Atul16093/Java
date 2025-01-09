import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many star hash do you need -: ");
        int n = sc.nextInt();
        int i = 0;
        while (i<=n) {
            if(i%2==0){
                System.out.print("* ");
            }else{
                System.out.print("# ");
            }
            i++;
        }
    }
}
