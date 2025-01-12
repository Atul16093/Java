/*Sub array with given sum
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.*/
import java.util.*;

public class Q7_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        int A[] = { 1, 2, 3, 10,4,6,3,6, 5 };
        int s = 15;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum == s) {
                    System.out.println("The index of " + s + " is " + i + " to " + j);
                }
            }
        }
    }
}
