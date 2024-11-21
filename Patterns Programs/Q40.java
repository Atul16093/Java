import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int original_num = num;
        int n =0 , even =0 , odd =0;
        while (num>0) {
            n = num%10;
            if(n%2==0){
                even++;
            }else{
                odd++;
            }
            num /=10;
        }
        System.out.print("In this "+original_num+" number the even number is "+even+" and the odd number is "+odd);
    }
}
