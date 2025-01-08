import java.util.Scanner;
public class Q70{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int half = row/2 ;
        int a  = 1 ;
        for(int i = 0 ; i <=row ; i++){
            if(half >= i ){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
                }
            }else if(half < i){
                for(int j = row -i ; j >=0 ; j-- ){
                    System.out.print("*");
                }
                a--;
            }
        System.out.println();
        }
    }
}