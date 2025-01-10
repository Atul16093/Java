package Collection;

/*
Modify an ArrayList
Objective: Develop a program to perform operations on an ArrayList.
Tasks:
Add 5 integers to an ArrayList.
Replace the second element with a new integer.
Remove the third element.
Display the updated ArrayList. */

import java.util.ArrayList;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList<>();
        for(int i = 1 ; i <=5 ; i++){
            System.out.print("Enter the Integer input for index "+i+" : ");
            int num = sc.nextInt();
            al.add(num);
        }
        System.out.println(al);
        System.out.println("Here we replaced the second element "+al.get(1) );
        al.set(1 , 567);
        System.out.println(al);
        System.out.print("After removing third element "+ al.get(2));
        al.remove(2);
        System.out.println(" Our ArrayList look like this : "+al);
        System.out.println("After over all changes our array list is this : " +al);
    }
}
