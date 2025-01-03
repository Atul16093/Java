package AssignmentOfString;
import java.util.Scanner;
/*Count Vowels and Consonants
Write a program to count the number of vowels and consonants in a string.

Example Input: hello world
Example Output: Vowels: 3, Consonants: 7
*/
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the String : ");
	        String str = sc.nextLine();
	        int vowels = 0;
	        int consonants =0;
	        for(int i = 0 ; i <str.length() ; i++){
	            char c = Character.toUpperCase(str.charAt(i));
	           if((c == 'A') || ( c == 'E') ||( c == 'I')||(c == 'O')||(c == 'U')){
	                vowels++;
	           }else{
	                consonants++;
	           }
	        }
	        System.out.printf("The consonat count of your string is %s and the vowels is : %s",consonants , vowels);
	}

}
