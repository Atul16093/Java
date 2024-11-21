//In this program , We will find which thing excecute first or Found the sequence .
//  static block
/*
1 First the Main Class Static block execute.Cause static block come in the existence when the class is loaded.
2 Second the B Class static block execute , but the "twist" int this Point is inside the B block static block the m1(); Method is called so
When the static block execute first it'll call the B class static method then the static block called . (M1 method call 2 time first by the class object , second by the 
static block);
3. After completing the work of B class the A class m1() method is called , but they also have static block so it'll come in the existence first.
*/
class A{
    static void m2(){
        System.out.println("It's a method of class A");
    }
    static{
        System.out.println("static block of class A");
    }
}
class B{
    static void m1(){
        System.out.println("It's a method m1 of class B");
    }
    static{
        m1();
        System.out.println("static block of class B");
    }
}
public class Static2 {
    static{
        System.out.println("It's a method of main class , that's class Static2");
    }
    public static void main(String[] args) {
        B.m1();
        A.m2();
    }
}
