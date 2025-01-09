//WAP to print N natural number.  

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //We take a input from the user 
        System.out.print("Enter a number -: ");
        int numb = sc.nextInt();
        int i = 1;
        while (i<=numb) {
            //This statement use for handle last comma
            if(i==numb){
                System.out.println(i);
            }else{
                System.out.print(i+",");
            }
            i++;
        }
    }
}
