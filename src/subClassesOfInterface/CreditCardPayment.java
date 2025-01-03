/**
 * 
 */
package subClassesOfInterface;
import  Interface.PaymentGateway;
/**
 * 
 */
public class CreditCardPayment implements PaymentGateway {
	@Override
	public void processPayment(double amount) {
		 System.out.printf("The method run from CreditCardPayment class %.2f\n", amount);
	}
}
