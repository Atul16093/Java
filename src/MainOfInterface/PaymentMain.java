package MainOfInterface;
import Interface.PaymentGateway;
import subClassesOfInterface.CreditCardPayment;
import subClassesOfInterface.UPIPayment;
import java.util.Scanner;
public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("what would you like to prefer for pay : press 1 for credit card , press 2 for UPIPayment : ");
		int user = sc.nextInt();
		if(user == 1) {
		PaymentGateway obj = new CreditCardPayment();
		obj.processPayment(45.5);
		}else if(user == 2) {
		PaymentGateway obj1 = new UPIPayment();
		obj1.processPayment(98.6);
		}else {
			System.out.println("Invalid input");
		}
	}

}
