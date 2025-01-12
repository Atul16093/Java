// Find minimum and maximum element in array
import java.util.Scanner;

public class Q2_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array -: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i <arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0 , min = arr[0];
        for(int i = 0 ; i< arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The max value is -: "+max + "\n and the min value is -: "+min);
      
    }
}
