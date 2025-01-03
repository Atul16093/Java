package subClassesOfAbstract;
import abstractClass.LibraryItem;
public class Book extends LibraryItem {
	public void checkout() {
		System.out.println("Checking the book title : "+super.title);
	}
	
	public Book(String title, String author) {
		super(title, author);
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String returnItem() {
		return "Retuning the book title : "+ super.title;
	}
}
