package subClassesOfInterface;
import Interface.PaymentGateway;

public class UPIPayment implements PaymentGateway {
	 public void  processPayment(double amount) {
		 System.out.printf("The method run from UPI payment class %.2f\n" ,amount);
	 }
}
