//Multiply the first row from the first column second row from the second column show on....
public class Q13 {
    public static void main(String[] args) {
        
        int arr[][] ={{ 1, 4, 6},
                     { 5, 8, 9},
                     { 6, 9, 19}};

        int arr1[][] = {{2,4,5}, 
                       { 5, 8, 9}, 
                       { 9, 3, 1}};

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr.length ; j++)
            {
                arr[i][j] = arr[i][j] * arr1[j][i];
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
      
    }
}
