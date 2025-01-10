package ObjectClass;
class A{
	String name ;
	String email ; 
	int age ;
	
	public A() {
		
	}
	public A(String name , String email , int age) {
		this.name = name ;
		this.email = email;
		this.age = age;
	}
	public String toString() {
		return name +" : "+email +" : "+ age;
	}
}
public class ToString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A("abc" , "abc@gmail.com" , 21);
		  System.out.println(obj);
	}

}
