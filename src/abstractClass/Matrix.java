package abstractClass;
import java.util.Scanner;
abstract class MatrixOperation{
	abstract void performOperation();
}

class MatrixAddition extends MatrixOperation{
	Scanner sc = new Scanner(System.in);
	void performOperation() {
		System.out.print("Enter the length of the square matrix array : ");
        int user = sc.nextInt();
        if(user >=1 && user <= 5) {
        int arr[][] = new int[user][user];
        int arr1[][] = new int[user][user];
        int arr2[][] = new int[user][user];
        for(int i = 0 ; i <user; i++){
            for(int j = 0 ; j < user ; j++){
                System.out.print("Enter your input for array arr index "+i+" ,"+j+" : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        for(int i = 0 ; i <user; i++){
            for(int j = 0 ; j < user ; j++){
                System.out.print("Enter your input for array arr1 index "+i+" ,"+j+" : ");
                arr1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i = 0 ; i <user; i++){
            for(int j = 0 ; j < user ; j++){
              arr2[i][j] = arr[i][j]+arr1[i][j];
            }
            System.out.println();
        }
        for(int i = 0 ; i <user; i++){
            for(int j = 0 ; j < user ; j++){
              System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        	}
        }else {
        	System.err.println("Length should be greater than 1 or less than 5");
        }
	}
}
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixOperation obj = new MatrixAddition();
		obj.performOperation();
	}

}
