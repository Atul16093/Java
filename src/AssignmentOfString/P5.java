package AssignmentOfString;
import java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the string : ");
	       String str = sc.nextLine();
	       int count = 0;
	       for(int i = 0 ; i < str.length(); i++) {
	    	   if(str.charAt(i) == 32) {
	    		   count++;
	    	   }
	       }
	      System.out.printf("The total number of space in your string is %d ", count);
	}

}
