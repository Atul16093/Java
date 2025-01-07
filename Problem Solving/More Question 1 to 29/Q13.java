import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number -: ");
        int a = sc.nextInt();
        System.out.print("Enter your Second number -: ");
        int b = sc.nextInt();
        System.out.println("Which operation do you want to perform -: \n press 1 for plus \n press 2 for multificationn \n press 3 for divide \n press 4 for substraction \n");
        System.out.print("Enter the operation value -: ");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                int add = a+b;
                System.out.println("The result of the addition is -: "+add);
                break;
            case 2:
                int multiply = a*b;
                System.out.println("The result of the multification is -: "+multiply);
                break;
            case 3:
                double divide = a/b;
                System.out.println("The result of the division is -: "+divide);
                break;
            case 4:
                int sub = a-b;
                System.out.println("The result of the substraction is -: "+sub);
                break;
            default:
            System.out.println("Invalid operation");
                
        }

    }
}
