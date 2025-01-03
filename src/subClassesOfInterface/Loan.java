package subClassesOfInterface;
import Interface.Principal;
import Interface.InterestRate;
public class Loan implements Principal , InterestRate {
	double P ;
	double R ;
	double N ;
	
	public Loan() {}

	public Loan(double p, double r, double n) {
		super();
		P = p;
		R = r;
		N = n;
	}
	public void retrieval() {
		if((P > 0 && P < 1000000 )&& (R > 0 && R < 0.99)&& (N > 0&& N < 25)) {
			double totalInterest = P * R * N ;
			System.out.printf("The interest Paid RS :%.2f", totalInterest);
		}else {
			System.err.print("Principal value should be less than 1 Million and Greater than 0 and Intreset value less than 0.99 and year ");
		}
	}
}
