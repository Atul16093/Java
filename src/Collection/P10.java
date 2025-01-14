package Collection;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<String> li = new LinkedList<>();
		System.out.print("Enter the number of book : ");
		int num = Integer.parseInt(sc.nextLine());
		for(int i = 0 ; i < num ; i++) {
			System.out.print("Enter the book title :");
			String s = sc.nextLine();
			li.add(s);
		}
		System.out.print("Books in the inventory are : " );
		for(String element : li) {
			System.out.print(element +",");
		}
	}

}
