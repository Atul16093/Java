public class Q11 {
    public static void main(String[] args) {
        
        int arr[][] = {{ 3, 55, 8}, {8, 9, 10}, {3,5,27}};

        int arr1[] = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++)
        {
            int sum = 0;
            for(int j = 0 ; j <arr[i].length ; j++)
            {
                sum+= arr[i][j];
            }
            arr1[i] = sum;
        }
        int max= 0 ;
        for(int i = 0 ; i <arr1.length ; i++)
        {
            if(max<arr1[i] )
            {
                max=arr1[i];
                    for(int j = 0 ; j <arr.length; j++){
                        System.out.print(arr[i][j]+" ");
                    }
                
                System.out.println("  -->  "+arr1[i]);
            }
        }
    }
}
