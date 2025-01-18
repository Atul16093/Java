/*
Create a class Person with properties (name and age) with following features.
Default age of person should be 18.
A person object can be initialized with name and age.
Method to display name and age of person

 */

import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.print("Name -: " + name + " Age -: " + age);
    }
}

public class Q16Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name -: ");
        String name = sc.nextLine();
        System.out.print("Enter your age -: ");
        int age = sc.nextInt();
        Person obj = new Person(name);
        Person obj1 = new Person(name, age);
        System.out.print(
                " press 1 for default age & press 2 for your given age ");
        int user = sc.nextInt();
        if (user == 1) {
            obj.display();
        } else {
            obj1.display();
        }

    }
}
