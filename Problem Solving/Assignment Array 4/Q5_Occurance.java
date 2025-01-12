// Find occurance of an integer number in array.
import java.util.Scanner;

public class Q5_Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("Enter the number do you want to find -: ");
        int user_input = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == user_input){
                System.out.print("The given input find in the array at the input of "+j+" \n");
             }
         }
     }
}

