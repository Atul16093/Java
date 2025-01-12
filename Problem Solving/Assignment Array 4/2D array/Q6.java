// Upper level triangle
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        
        // Creating an 2D array
        int arr[][] = {{ 1, 2, 4},{ 6,2,5},{ 12,9,19}};

        for(int i = 0 ; i <arr.length ; i++)
        {
            for (int j =0 ; j <arr[i].length ; j++)
            {
                if(i<j)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
