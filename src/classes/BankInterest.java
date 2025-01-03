package classes;
/*
Create a parent class Bank with a method getInterestRate() that returns 0.
Create subclasses:
SBI that overrides getInterestRate() to return 5.
ICICI that overrides getInterestRate() to return 6.
Axis that overrides getInterestRate() to return 7.
In the Main class, demonstrate method overriding by calling getInterestRate() on different bank objects.
*/
class Bank{
	int getInterestRate() {
		return 0;
	}
}
class SBI extends Bank{
	@Override
	int getInterestRate() {
		return 5;
	}
}
class ICICI extends Bank{
	@Override
	int getInterestRate() {
		return 6;
	}
}
class AXIS extends Bank{
	@Override
	int getInterestRate() {
		return 7;
	}
}
public class BankInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj[] = new Bank[5];
		obj[0] = new Bank();
		obj[1] = new SBI();
		obj[2] = new ICICI();
		obj[3] = new AXIS();
		System.out.println(obj[0].getInterestRate()+"\n"+obj[1].getInterestRate() +"\n"+obj[2].getInterestRate()+"\n"+obj[3].getInterestRate());
		
	}

}
