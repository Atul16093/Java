package Collection;

/*
Write a Java program that takes integer data from the user and adds it to an ArrayList. Perform the following operations:

1.	Check if a given number exists in the ArrayList or not.
2.	Remove a particular element from the ArrayList and display the updated ArrayList.
     3. Print all the elements of the ArrayList using a for loop.
   4. Print all the elements using the Iterator interface.
   5. Print all the elements using the for-each loop.
   6. Print all the elements in descending order.
  7. Count how many elements are there in the ArrayList. 
Input format :
The first line of the input should contain an integer representing the size of the ArrayList
The second line of the input should contain the elements to be added to the ArrayList
The third line of the input should contain the number to be searched in the ArrayList.
The fourth line of the input should contain the number to be removed from the ArrayList
Output format :
The output should display the elements in the list after the removal.
Refer to the sample output for reference.
Sample test cases :
Input 1 :
5
10 12 14 16 18
10
20
Output 1 :
Number 10 exists in the ArrayList
ArrayList after removing 20
10 12 14 16 18 
ArrayList elements using normal for loop
10 12 14 16 18 
ArrayList elements using Iterator interface
10 12 14 16 18 
ArrayList elements using for-each loop
10 12 14 16 18 
ArrayList elements in descending order
18 16 14 12 10 
Number of elements in the ArrayList: 5
Input 2 :
8
20 18 17 45 89 63 27 90
10
20
Output 2 :
Number 10 not exists in the ArrayList
ArrayList after removing 20
18 17 45 89 63 27 90 
ArrayList elements using normal for loop
18 17 45 89 63 27 90 
ArrayList elements using Iterator interface
18 17 45 89 63 27 90 
ArrayList elements using for-each loop
18 17 45 89 63 27 90 
ArrayList elements in descending order
90 89 63 45 27 18 17 
Number of elements*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		char user = 'Y';
		// Taking input from the user without asking the size
		while (Character.toUpperCase(user) == 'Y') {
			System.out.print("Enter the element : ");
			int n = sc.nextInt();
			al.add(n);
			System.out.print("Do you want take more input so type Y, if you donn't want to take more input  type N : ");
			user = sc.next().charAt(0);
		}
		// 1. Check if a given number exists in the ArrayList or not.
		/*
		 * System.out.print("Which number do you want to find Enter it here : ");
		 * Integer num = sc.nextInt();
		 * boolean flag = false;
		 * for(Integer obj : al) {
		 * if(num.equals(obj)) {
		 * flag = true ;
		 * }
		 * }
		 * if(flag == true ) {
		 * System.out.print("The object you entered is avilable in the arraylist");
		 * }else {
		 * System.out.print("The object you entered is not avilable in the arraylist");
		 * }
		 */
		// _____________________________________________________________________________________________
		// _____________________________________________________________________________________________

		// Remove a particular element from the ArrayList and display the updated
		// ArrayList.

		System.out.print("Enter the element which you want to remove : ");
		Integer rem = sc.nextInt();
		boolean f = false;
		ListIterator<Integer> itr = al.listIterator();
		while (itr.hasNext()) {
			Integer n = itr.next();
			if (rem.equals(n)) {
				itr.remove();
			}
		}
		System.out.println("The arraylist after removing the element is look like this : " + al);
		/*
		 * _____________________________________________________________________________________________
		 * _____________________________________________________________________________________________
		 * Print all the elements of the ArrayList using a for loop.
		 * 
		 */
		System.out.print("Printing the arraylist object by using loop : ");
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		/*
		 * _____________________________________________________________________________________________
		 * _____________________________________________________________________________________________
		 * Print all the elements using the Iterator interface.
		 * 
		 */
		System.out.print("These all object print by using Iterator ");
		Iterator<Integer> itr1 = al.listIterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}
		System.out.println();
		/*
		 * _____________________________________________________________________________________________
		 * _____________________________________________________________________________________________
		 * Print all the elements using the for-each loop.
		 * 
		 */
		System.out.print("These all object print by using foreach loop ");
		for (Integer obj : al) {
			System.out.print(obj + " ");
		}
		System.out.println();

		/*
		 * _____________________________________________________________________________________________
		 * _____________________________________________________________________________________________
		 * Print all the elements in descending order.
		 */

		System.out.print(" Print all the elements in descending order : ");
		for (int i = 0; i < al.size(); i++) {
			for (int j = i; j < al.size(); j++) {
				if (al.get(i) < al.get(j)) {
					Integer f1 = al.get(j);
					Integer f2 = al.get(i);
					al.set(i, f1);
					al.set(j, f2);

				}
			}
		}
		System.out.println(al);
		/*
		 * _____________________________________________________________________________________________
		 * _____________________________________________________________________________________________
		 * Count how many elements are there in the ArrayList.
		 */
		System.out.println("The number of element avilable in the arrylist is this : " + al.size());
	}

}
