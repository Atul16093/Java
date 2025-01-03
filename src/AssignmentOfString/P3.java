package AssignmentOfString;
import java.util.Scanner;
/*
String Reversal
Write a program to reverse a given string.
Example Input: Java
Example Output: avaJ
Remove Whitespace
*/
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
		String str1 = "";
        for(int i = str.length()-1 ; i >=0; i--){
            if(str.charAt(i) != 32){
            str1 += str.charAt(i);
            }
        }
        System.out.println(str1);
	}

}
