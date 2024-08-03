import java.util.Scanner;
public class Q66{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
	for(int i = 0 ; i < row ; i++){
		char a = 'A';
	  for(int j = 0 ; j < i ; j++){
		System.out.print(" ");
	        }
	 for(int k = 0 ; k < row-i ; k++){
		System.out.print(a+" ");
		a++;
	    }
	System.out.println();
	}
    }
}