/*   
     1
    101
   10101
  1010101
 101010101 */
public class Q83{
    public static void main(String []args){
        int row = 5;
        int a = 1; 
        for(int i = 0 ; i <row ; i++){
            for(int j = 0 ; j <row-i ; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k <(i+a); k++){
                if(k%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            a++;
            System.out.println();
        }
    }
}