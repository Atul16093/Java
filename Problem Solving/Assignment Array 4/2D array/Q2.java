//SUbstraction of two matrix
public class Q2 {
    public static void main(String[] args) {

        // Here the two array we want to substract it -: 

        int arr[][] = {{11,12,13},{23,12,32},{21,17,18}};

        int arr2[][]= {{10,1,9},{11,8,5},{4,6,8}};
        
        System.out.println("The substraction of the array is -: ");
        for(int i = 0 ; i <arr.length;i++)
        {
            for(int j = 0 ; j <arr[i].length; j++)
            {
                // We store substraction data in the existing array arr 
               arr[i][j]  = arr[i][j] - arr2[i][j];
            
                System.out.print(arr[i][j]+" ");
    
                }
            System.out.println();
            }
        }
    }

