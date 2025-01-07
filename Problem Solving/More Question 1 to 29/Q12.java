import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character -: ");
        String ch = sc.next();
        switch (ch) {
            //We can apply multiple case for a particular function
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("It's a vowel");
                break;
        
            default:
            System.out.println("It's a consonant");
                break;
        }
    }
}
