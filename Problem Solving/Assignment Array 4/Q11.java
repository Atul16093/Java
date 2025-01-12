/*Q.11 Count pair with given sum.
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

Example 1:
Input:
N = 4, K = 6
arr[] = {1,5,7,1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

Example 2:
Input:
N = 4, X = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation:
Each 1 will produce sum 2 with any 1.*/
public class Q11 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1};
        // int arr[] = { 1, 5, 7, 1 };
        int k = 2;
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            for (int j = (i + 1); j < arr.length; j++) {
                a = arr[i] + arr[j];
                if (a == k) {
                    pair++;
                }
            }
        }
        System.out.println(pair);
    }
}
