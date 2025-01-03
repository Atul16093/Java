package MainOfInterface;
import Interface.Principal;
import Interface.InterestRate;
import subClassesOfInterface.Loan;
import java.util.Scanner;
public class LoanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal value : ");
		double p = sc.nextDouble();
		System.out.print("Enter the annual interest rate : ");
		double r = sc.nextDouble();
		System.out.print("Enter the year : ");
		double y = sc.nextDouble();
		Principal obj = new Loan(p , r , y);
		obj.retrieval();
	}

}
