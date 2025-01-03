/**
 * 
 */
package classes;
import java.util.Scanner;
/**
 * 
 */
class Pizza {
	private double price;
	private double topPrice;
	private int topLevel;
	public Pizza() {
		
	}
	public Pizza(double price , double topPrice , int topLevel ) {
		this.price = price;
		this.topPrice = topPrice;
		this.topLevel = topLevel;
	}
	public void calculatePrice() {
		double p = price +(topPrice * topLevel);
		System.out.println("Pizza price without discount is : "+p);
		System.out.println("Pizza price with discount is : "+p);
	}
}
class DiscountedPizza extends Pizza{
	private double price ;
	private double topPrice;
	private int topLevel;
	public DiscountedPizza(double price , double topPrice , int topLevel ) {
		this.price = price;
		this.topPrice = topPrice;
		this.topLevel = topLevel;
	}
	@Override
	public void calculatePrice() {
		double p = price +(topPrice * topLevel);
//		it's a fraction in math
		double dis =p*9/10;
	        
		System.out.println("Pizza price without discount is : "+p);
		System.out.println("Pizza price with discount is : "+dis);
	}
}
public class ProgramOfPizza{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price of the Pizza : ");
		double price = sc.nextDouble();
		System.out.print("Enter the topping Price : ");
		double topPrice = sc.nextDouble();
		System.out.print("Number of topping on the pizza : ");
		int topLevel = sc.nextInt();
		if(topLevel>=1 && topLevel <=10) {
			if(topLevel <=3) {
				Pizza obj = new Pizza(price , topPrice , topLevel);
				obj.calculatePrice();
			}else {
				Pizza obj = new DiscountedPizza(price , topPrice , topLevel);
				obj.calculatePrice();
			}
		}else {
			System.out.println("top level should be greater than 0 and less than 10");
		}
		
	}
}

