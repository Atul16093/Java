// Write a program to reverse the array.
import java.util.Scanner;

public class Q3_Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array -: ");
        int size = sc.nextInt();
        int arr [] = new int[size];
        for(int i = 0 ; i <arr.length; i++){
            arr[i]  = sc.nextInt();
        }
        System.out.print("The reverse array is this -: ");
        int j = arr.length-1;
        for(int i = j ; i>=0 ; i--){
            System.out.print(arr[i]+" ");
        }
    }
}