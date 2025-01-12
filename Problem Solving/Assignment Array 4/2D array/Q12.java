// sum of 2D array by indexes
public class Q12 {
    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 8 }, { 8, 5, 10 } };
        int arr1[][] = { { 3, 3, 6 }, { 32, 5, 9 }, { 21, 3, 9 } };
        System.out.println("The addition of all indexes number is -: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = arr[i][j] + arr1[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
