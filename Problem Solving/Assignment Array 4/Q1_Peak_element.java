/*
 An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

Example 1:
Input:
N = 3
arr[] = {1,2,3}
Output: 1
Explanation: index 2 is 3.
 */
import java.util.Scanner;

public class Q1_Peak_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the array size -: ");
        // int size = sc.nextInt();
        // int arr[] = new int[size];
        int arr[] = {4,4,4,4,4};
        // for(int i = 0 ; i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        for(int i = 1 ; i<arr.length-1;i++){
            
            if(arr[i-1] < arr[i] && arr[i+1]<arr[i]){
                System.out.println("The index of the array is "+i+" and according to your instruction we are printing 1");
                System.exit(i);
            }
        }
        System.out.println("There is no peek element here that's why the answer is -: 0"); 

        }
       
    }

