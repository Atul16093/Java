import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("what is the length of you fibonacci series -: ");
        int num = sc.nextInt();
        int n1 = 0 , n2 = 1 , n3;
        System.out.print(n1 +" "+ n2);
        for(int i=0 ; i<num;i++){
          n3 = n1+n2;
          System.out.print(" "+n3);
          //assining the value
          n1 = n2;
          n2 = n3;
        }
    }
}
