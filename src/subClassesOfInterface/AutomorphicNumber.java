package subClassesOfInterface;
import Interface.AutomorphicChecker;
import Interface.NumberInput;
import java.util.Scanner;
public class AutomorphicNumber implements AutomorphicChecker , NumberInput{
	int value ;
	public void numberInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for automorphic checking : ");
		this.value = sc.nextInt();
	}
	public void automorphicChecker() {
		if(value > 0 && value < 10000) {
		double square = Math.pow(value, 2);
	      int num = (int)square;
	      int count = 0 ;
	      int temp = value ;
	      while(temp>0){
	         temp /= 10;
	         count++;
	      }
	    //Making the moduleo value and converting into the integer
	      StringBuffer sb = new StringBuffer();
	      sb.append(1);
	      for(int i = 1 ; i <=count ; i++){
	             sb = sb.append(0);
	      }
	      String str = sb.toString();
	      int n = Integer.parseInt(str);
	      int result = num % n;
	      if(result == value){
	          System.out.println("The number is automorphic");
	        }else{
	          System.out.println("It's not a automorphic numberic");
	        }
		}else {
			System.err.println("Value should be greater than 0 and less than 10000");
		}
	}
}
