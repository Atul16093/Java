//Print 2D array and swicth the row into the column
public class Q7 {
    public static void main(String[] args) {
        
        int arr[][] = {{ 3, 4, 5}, { 6, 7, 3,}, { 9, 1, 21}};

        for( int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length; j++)

            //We just do swap i to j
            {
                System.out.print(arr[j][i]+",");
            }
            System.out.println();
        }
    }
}
