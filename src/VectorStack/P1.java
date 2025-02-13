package VectorStack;
import java.util.ListIterator;
/*Reverse a String using Stack

Write a Java program that takes a string as input and uses a stack to reverse the string.
Example:
Input: "hello"
Output: "olleh"
*/
import java.util.Scanner;
import java.util.Stack;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your input : " );
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		Stack <Character> s = new Stack<Character>();
//		s.addElement(str);
		for(char c :ch) {
			s.push(c);
		}
		System.out.println(s);
		String reverse = "";
		while(!s.isEmpty()) {
			reverse += s.pop();
		}
		System.out.println(reverse);
	}

}
