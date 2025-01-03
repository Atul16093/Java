package abstractClass;

public abstract class LibraryItem {
	public String title;
	public String author;
	public LibraryItem(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public LibraryItem() {
		// TODO Auto-generated constructor stub
	}
	public abstract void checkout();
	public abstract String returnItem();
	public void displayInfo(){
		System.out.println(title +",\n"+author);
	}
}
