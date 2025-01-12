//Find the sum of the even number in 2D array 
import java.util.Scanner;

public class Q1_Even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row length -: ");
        int m = sc.nextInt();
        System.out.println("Enter the column length -: ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i = 0 ; i <arr.length; i++){
            for(int j = 0 ; j <arr[i].length;j++){
                System.out.println("Enter the input for index "+i+" "+j);
                 arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int sum = 0;
        for(int i = 0 ; i <arr.length; i++){
            for(int j = 0 ; j <arr[i].length;j++){
               if(arr[i][j]%2==0){
                sum += arr[i][j];
               }
                
            }
            System.out.println();
        }
        System.out.println(sum);
        
    }
}
