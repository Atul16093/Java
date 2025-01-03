/**
 * 
 */
package classes;

/**
 * 
 */
class A{
	{
		System.out.println("It's a instace block of A class");
	}
	static {
		System.out.println("It's a static block of A class");
	}
	public A() {
		System.out.println("A class Constructor");
	}
}
class B extends A{
	{
		System.out.println("It's a instace block of B class");
	}
	static {
		System.out.println("It's a static block of B class");
	}
	public B() {
		System.out.println("B class Constructor");
	}
}
public class OverridingPractice {
	{
		System.out.println("It's a instace block of main class");
	}
	static {
		System.out.println("It's a static block of main class");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * When we create a refrence of Parent class and object of B class and If instace and static block avilable, so it'll first load the main class static block 
		 * and order could be like this :
		 * It's a static block of main class
			It's a static block of A class
			It's a static block of B class
			It's a instace block of A class
			A class Constructor
			It's a instace block of B class
			B class Constructor 
		  */
		A obj = new B();
	}

}
