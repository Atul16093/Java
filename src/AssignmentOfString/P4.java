package AssignmentOfString;
import java.util.Scanner;
public class P4 {
	public static void main(String []args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the String : ");
	        String str = sc.nextLine();
		    String str1 = "";
		    for(int i = 0 ; i < str.length() ; i++){
		    	if(str.charAt(i) != 32){
		    		str1 += str.charAt(i);
		    		}
		    	}
		    System.out.println(str1);
	}
}
