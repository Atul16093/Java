import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1 , -1 , 3 , 2 , -7 , -5 , 11 , 6};
        for(int i = 0 ; i <3; i++){
            for(int j = 0 ; j <arr.length-1 ; j++){
                if(arr[j]<0){
                    int temp = arr[j];
                    arr[j]   = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0 ; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
