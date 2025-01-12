
// Left digonal 
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating a 2D array

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // The variable help us to print dignoal value
        int value = 0;
        System.out.print("The value of left dignoalses is -: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    value = arr[i][j];
                    System.out.print(value + " ");
                }
            }
        }

    }
}
