/*
    1
    2
    3
    4
123454321
    4
    3
    2
    1
*/
import java.util.Scanner;
public class Q82{
    public static void main(String []args){
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter the number of row -: ");
    int row = sc.nextInt();
    int half = (row+1)/2;
    int a = row/2;
    for(int i = 1 ; i <=row ; i++){
        if(i<half){
        for(int j = 1 ; j <half ; j++){
            System.out.print(" ");
        }
        for(int k = 1 ; k <=1 ; k++){
            System.out.print(i);
        }
        }else if(i>half){
             for(int j = 1 ; j <half ; j++){
            System.out.print(" ");
        }
            for(int k = 1 ; k <=1; k++){
                System.out.print(a);
                     a--;
            }
        }else if (i==half){
            for(int j = 1 ; j <=a ; j++){
                System.out.print(j);
            }
            for(int j = half ; j>=1 ; j--){
                System.out.print(j);
            }
        }
        System.out.println();
    }
    }
}