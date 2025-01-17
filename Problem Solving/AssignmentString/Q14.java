
// WAP check if a String contains only digits?
import java.util.Scanner;

class Find {
    private String s;

    public Find(String s) {
        this.s = s;
    }

    boolean flag = false;

    public void checker() {
        char ch[] = s.toCharArray();
        for (char ch1 : ch) {
            if (ch1 >= 48 && ch1 <= 57) {
                flag = true;
                break;
            }
        } 
            if (flag) {
                System.out.println("It's contain digit");
            } else {
                System.out.println("It's not contain digit");

            }

    }

}

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string -: ");
        String s = sc.nextLine();
        Find obj = new Find(s);
        obj.checker();
    }
}
