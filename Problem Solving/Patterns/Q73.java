import java.util.Scanner;
public class Q73{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row -: ");
        int row = sc.nextInt();
        int half = row/2 ;
        for(int i = 1 ; i <=row ; i++){
            int num = 1;
            if(half >= i ){
                for(int j = 1 ; j <=i ; j++){
                     if(j==1 || j==i ){
                System.out.print(j);
                        }else{
                            System.out.print("_");
                        }
                            }
            }else if(half < i){
                for(int j = row-i ; j > 1 ; j--){
                    if(j==row-i || j==2){
                    System.out.print(num);
                        num++;
                        }else{
                            System.out.print("_");
                            num++;
                        }
                    }
                }
            System.out.println();
        }
    }
}