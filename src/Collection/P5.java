package Collection;
/*
Search in an ArrayList
Objective: Write a program to search for an element in an ArrayList.

Tasks:

Allow the user to enter multiple strings into an ArrayList.
Prompt the user to enter a string to search for.
Check if the string exists in the list and display its position(s). */
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList <String> al = new ArrayList<>();
		System.out.print("Number of input do you want to give : ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0 ; i <n ; i++) {
			System.out.print("Enter the String for index " +i);
			String s = sc.nextLine();
			al.add(s);
		}
		System.out.print("Enter the String do you want to find in the ArrayList : ");
		String s = sc.nextLine();
		/*
		ListIterator<String> lit = al.listIterator();
		while(lit.hasNext()) {
			String str = lit.next();
			if(s.equals(str)) {
				System.out.println("Yes! The String exist at index : "+al.indexOf(s));
			}
		*/
		for(int i = 0; i <al.size(); i++) {
			String str = al.get(i);
			if(s.equalsIgnoreCase(str)) {
				System.out.println("Yes! The String exist at index : "+i);
			}
		}
	}

}
