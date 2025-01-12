//The sum of all 2D array element is -: 
import java.util.Scanner;

public class Q1_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] ={{1 ,2 ,3},{4,5,6},{8,7,9}};
        int sum = 0;
        for(int i=0; i <arr.length;i++){
            for(int j = 0 ; j <arr[i].length; j++){
                 sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of all 2D array element is -: "+sum);
    }
}
