import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the day number -: ");
        int dayNum = sc.nextInt();
        switch (dayNum) {
            case 1:
                System.out.println("It's monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("Hurry! It's Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
