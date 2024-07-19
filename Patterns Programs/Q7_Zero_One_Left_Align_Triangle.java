/*
 Print zero one in the left align triangle
1
00
111
0000
11111
 */
import java.util.Scanner;

public class Q7_Zero_One_Left_Align_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows -: ");
        int row = sc.nextInt();
        for(int i = 0 ; i <=row ; i++){
            for(int j = 0 ; j <=i ; j++){
                if(i%2==0){
                System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
