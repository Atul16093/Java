import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
       int range = 26;
       char cap = 'A';
       char small = 'b';
       System.out.println(small);
       int i = 1;
       while (i<=range) {
        if(i%2==0){
            System.out.print(small +" ");
            small+=2;
        }else{
            System.out.print(cap+" ");
            cap+=2;
        }
        i++;
       }
    }
}
