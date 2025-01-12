//Sum of all row 
public class Q9 {
    public static void main(String[] args) {
        
        int arr[][] = {{ 1, 2, 3},{ 3, 5, 8},{9, 1, 7}};   

        System.out.print("The sum of all row is -: ");
        
        for( int i = 0 ; i <arr.length ; i++){
            int sum = 0 ;
            for(int j = 0 ; j <arr[i].length ; j++)
                {  
                    //Here we are adding every row indexes when our loop is repiting 
                   sum += arr[i][j];
                }
        System.out.print(sum+" ");
        }
    }
}
