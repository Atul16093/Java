package subClassesOfAbstract;

import abstractClass.Payment;

public class CreditCardPayment extends Payment{
	String cardNumber;
	public CreditCardPayment(double amount , String tID , String cardNumber) {
		super(amount , tID);
		this.cardNumber = cardNumber;
	}
	public CreditCardPayment() {}
	public void processPayment(){
		System.out.println("Processing credit card payment for amount: "+super.amount);
	}
	public void displayDetails(){
		System.out.println("Detail of credit card payment  : Amount :"+super.amount +",\nID : "+super.transactionID+",\nCardNumber : "+cardNumber);
	}
}
