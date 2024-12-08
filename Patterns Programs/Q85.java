public class Q85{
    public static void main(String []args){
        int row = 7 ; 
        for(int i = 1 ; i <=row ; i++){
            for(int j = 1 ; j <= row-i ; j++){
                System.out.print(" ");
            }
            int sum = 0 ;
            for(int k = 1 ; k <=i ; k++){
                
                sum += k;
            }
            System.out.println();
        }
    }
}