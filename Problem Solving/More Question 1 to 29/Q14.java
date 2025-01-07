import java.util.Scanner;
public class Q14 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a<b&&a<c&&a<d){
            System.out.println("a is lesser");
        }else if (b<a&&b<c&&b<d){
            System.out.println("b is lesser");
        }else if (c<a&&c<b&&c<d){
            System.out.println("C is lesser");
        }else{
            System.out.println("d is leasser");
        }
   } 
}
