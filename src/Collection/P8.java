package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

/*WAP to create product class with attributes pid, pname, pprice, plocation. create setter,
 getter and constructor in the class. create 5 objects and store them in arraylist...display all products using for each loop and ListIterator.
after that display only those products whose price is above 500.*/
class Product{
	private int pId, pPrice;
	private String pName , pLocation;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pId, int pPrice, String pName, String pLocation) {
		super();
		this.pId = pId;
		this.pPrice = pPrice;
		this.pName = pName;
		this.pLocation = pLocation;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpLocation() {
		return pLocation;
	}
	public void setpLocation(String pLocation) {
		this.pLocation = pLocation;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pPrice=" + pPrice + ", pName=" + pName + ", pLocation=" + pLocation + "]";
	}
    
}
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Product> al = new ArrayList();
		al.add(new Product(1 , 4500 , "HeadPhone" , "Hyderabad"));
		al.add(new Product(2 , 144500 , "Phone" , "Mumbai"));
		al.add(new Product(3 , 500 , "Facewash" , "Nagpur"));
		al.add(new Product(4 , 13500 , "Bluetooth Speaker" , "Banglore"));
		al.add(new Product(5 , 10000 , "Bag" , "UP"));
		
		for(Product p : al) {
			System.out.println(p);
		}
		ListIterator <Product> lit = al.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		
	}

}
