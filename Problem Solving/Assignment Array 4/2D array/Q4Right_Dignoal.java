//Right digonal
public class Q4Right_Dignoal {
    public static void main(String[] args) {
        
        // creating an 2D array 
        int arr[][] = {{ 1, 2, 3}, { 4, 5, 6},{ 7, 8, 9}};

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0  ; j <arr[i].length; j++){

                if(i+j==2){
                    System.out.print(arr[i][j]+" ");

                }
             }
        }
    }
}
