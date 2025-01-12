/*Find the row with maximum number of 1s */
public class Q14{
    public static void main(String []args){
        int arr[][] = {{0,0,1,1},{0,0,1,1}, {1,1,1,1},{0,1,1,1}};
            int previosCount = 0;
            int row = 0;
        for(int i = 0 ; i < arr.length; i++){
            int count = 0;
            for(int j = 0 ; j  <arr.length ; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            int count1 = count;
            if(previosCount < count1){
                previosCount = count1;
               row = i;
            }
        }
        System.out.print(row);
    }
}