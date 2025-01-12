// Write a program to sort the array
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i <arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // int sort_min = arr[0];
        for(int i=0; i<arr.length;i++){
            for (int j = 0; j <arr.length-1; j++) {
                if (arr[j ] > arr[j+1]) {
                    int temp = arr[j+1 ];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                // System.out.print(arr[j-1] +" ");.
                // int temp = sort_min;
            }
        }
        for(int i = 0; i<arr.length;i++ ){
            System.out.print(arr[i]+" ");
        }
    }
}
