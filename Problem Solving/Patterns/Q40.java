/*
*
* *
* * * *
* * * * * * * *
* * * * * * * * * * * * * * * *
 */
import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int a = 1;
        for(int i = 1 ; i <=row ; i++){
            for(int j = 1 ; j <=a ; j++){
                System.out.print("* ");
            }
            // if(i!=1){
            // a=a+i;
            // }
            a = a*2;
            System.out.println();
        }
    }
}
