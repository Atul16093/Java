package AssignmentOfString;
import java.util.Scanner;
/*Palindrome Check
Write a program to check if a given string is a palindrome (reads the same backward as forward).

Example Input: madam
Example Output: Yes, it's a palindrome.
*/
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        String str1 = "" ; 
        for(int i = str.length()-1 ; i >=0; i--){
            str1 += str.charAt(i);
        }
        System.out.println(str1);
        if(str.equals(str1)){
            System.out.print("It's a palindrome String");
        }else{
            System.out.println("It's not a palindrome String");
        }
        
	}

}
