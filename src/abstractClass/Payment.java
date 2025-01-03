package abstractClass;
public abstract class Payment{
	public double amount;
	public String transactionID;
	public Payment(double amount , String transactionID) {
		this.amount = amount;
		this.transactionID = transactionID;
	}
	abstract public void processPayment();
	abstract public void displayDetails();
	public Payment() {
		
	}
	
}

