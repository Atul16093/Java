package AssignmentOfString;
import java.util.Scanner;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       String str = sc.nextLine();
	       boolean flag = false;
	       for(int i = 0 ; i < str.length(); i++) {
	    	   if(str.charAt(i) == '@' || str.charAt(i) == '$' || str.charAt(i) == '#') {
	    		   flag = true;
	    		   break;
	    	   }
	       }
	       if(flag == true) {
	    	   System.out.println("Yes! the string contains those charater that provided ");
	       }else {
	       	   System.out.println("No! the string doesn't contain any character");
	       		 }
		}
}
