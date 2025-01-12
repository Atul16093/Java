//switching first column with the last column 
public class Q10 {
    public static void main(String[] args) {

        int arr[][] = { { 1, 4, 5 }, { 5, 7, 9 }, { 9, 1, 3 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j + 2];
                    arr[i][j + 2] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
