package subClassesOfAbstract;

import abstractClass.LibraryItem;

public class DVD extends LibraryItem{
	public void checkout() {
		System.out.println("Checking the DVD title : "+super.title);
	}
	
	public DVD(String title, String author) {
		super(title, author);
	}

	public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String returnItem() {
		return "Returning the DVD title : "+ super.title;
	}
}
