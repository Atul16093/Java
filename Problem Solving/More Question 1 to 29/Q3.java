import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first subject marks -: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter your second subject marks -: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter your third subject marks -: ");
        int sub3 = sc.nextInt();
        System.out.print("Enter your fourth subject marks -: ");
        int sub4 = sc.nextInt();
        System.out.print("Enter your fifth subject marks -: ");
        int sub5 = sc.nextInt();
        int total_Marks = sub1+sub2+sub3+sub4+sub5;
        System.out.println(total_Marks);
        float presentage = (total_Marks*100)/500;
        System.out.println(presentage);
        if (presentage > 90) {
            System.out.println("Congratulation ! you are scoring 80 above and you got grade -: A ");
        } else if (presentage > 80 && presentage<= 90) {
            System.out.println("Awesome ! your grade is -: B ");
        } else if (presentage >=60 && presentage <= 80) {
            System.out.println("Good ! your grade is -: C ");
        } else if (presentage >=35 && presentage < 60) {
            System.out.println(" your grade is -: D ");
        } else{
            System.out.println("FAIL");
        }
    }
}
