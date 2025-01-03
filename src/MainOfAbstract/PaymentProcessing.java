package MainOfAbstract;
import abstractClass.Payment;
import subClassesOfAbstract.CreditCardPayment;
import subClassesOfAbstract.PayPalPayment;

import java.util.Scanner;
public class PaymentProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount : ");
		double amount = Double.parseDouble(sc.nextLine());
		System.out.print("Enter the transactionID : ");
		String transactionID = sc.nextLine();
		System.out.print("Enter the cardNumber : ");
		String cardNumber = sc.nextLine();
		System.out.print("Enter the paypalNumber : ");
		String paypalNumber = sc.nextLine();
		Payment obj = new CreditCardPayment(amount , transactionID , cardNumber);
		Payment obj1 = new PayPalPayment(amount , transactionID , paypalNumber);
		obj.displayDetails();
		obj1.displayDetails();
	}
}
