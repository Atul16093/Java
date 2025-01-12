//Lower triangle 
public class Q5 {
    public static void main(String[] args) {
        
        int arr[][] = {{23,43,54},{32,12,21},{4,6,8}};

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j <arr[i].length; j++){
                // This help us to print low 
                if(i>j){
                    System.out.print(arr[i][j]+" ");

                }
            }
        }
    }
}
