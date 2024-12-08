/*
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *
*/
public class Q84{
    public static void main(String[]args){
        int row = 8;
        for(int i = 0 ; i <=row ; i++){
            for(int j = 0 ; j <=row ; j++){
                if(i==j || (i+j)==row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}