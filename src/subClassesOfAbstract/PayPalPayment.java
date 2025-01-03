package subClassesOfAbstract;
import abstractClass.Payment;
public class PayPalPayment extends Payment{
	public String payPalID;
	public PayPalPayment(double amount , String tID , String payPalID) {
		super(amount , tID);
		this.payPalID = payPalID;
	}
	public PayPalPayment() {}
	public void processPayment() {
		System.out.println("Processing pay pal payment for amount: "+super.amount);
	}
	public void displayDetails() {
		System.out.println("Detail of paypal payment : ID : "+super.transactionID +",\nAmount : "+super.amount +",\nPayPalID : "+payPalID);
	}
}
