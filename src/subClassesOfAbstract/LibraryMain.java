package subClassesOfAbstract;

import java.util.Scanner;

import abstractClass.LibraryItem;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book title name  : ");
		String title = sc.nextLine();
		System.out.println("Enter the book author name : ");
		String author = sc.nextLine();
		LibraryItem obj = new Book(title , author);
		LibraryItem obj1 = new DVD(title , author);
		obj.checkout();
		System.out.println(obj.returnItem());
		obj1.checkout();
		System.out.println(obj1.returnItem());
	}

}
