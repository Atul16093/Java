// Write a program to cyclically rotate array by one.

public class Q10{
    public static void main(String []args){
        // int arr[] = {2,3,4,5,1};
        // int arr1[] = new int[arr.length];
        // int last = arr[arr.length-1];
        // for(int i = 0 ; i < arr.length ; i++){
        //     if(i==0){
        //         arr1[i] = last;
        //     }else{
        //         arr1[i] = arr[i-1];
        //     }
        // }
        // for(int i = 0 ; i<arr1.length ; i++){
        //     System.out.print(arr1[i] +" ");
        // }

        int arr[] = {1,2,3,4,5};
        for(int i = arr.length-1; i>0 ; i--){
            int temp = arr[i];
            arr[i]   = arr[i-1];
            arr[i-1] = temp;
        }
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}