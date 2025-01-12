//Switch the first row from the last row
//Sorting the every row in 2D array 

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
         * System.out.print("Enter the no. of row -: ");
         * 
         * int m = sc.nextInt();
         * 
         * System.out.print("Enter the no. of column -: ");
         * 
         * int n = sc.nextInt();
         * 
         * int arr[][] = new int[m][n];
         * 
         * for(int i = 0 ; i <arr.length ; i++)
         * {
         * for(int j = 0 ; j <arr[i].length ; j++)
         * {
         * System.out.print("Enter the value for index "+i+ " "+j);
         * arr[i][j] = sc.nextInt();
         * }
         * }
         */
        int arr[][] = { { 4, 3, 6, 4, 3,4,5,6 }, { 9, 5, 4 ,3, 1,4,5,6}, { 7, 3, 1, 4, 3,2,1,0} };
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j] > arr[i][j + 1]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = temp;
                }
            for (int k = 0; k < arr[i].length - 1; k++) {
                if (arr[i][k] > arr[i][k + 1]) {
                    int temp = arr[i][k];
                    arr[i][k] = arr[i][k + 1];
                    arr[i][k + 1] = temp;
                }
            }
        }
        }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
    }
}
}