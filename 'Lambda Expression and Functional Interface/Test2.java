/*Functional interface only have one abstract method , and default and static method can be multiple.
We can check any interface is funtional or not by the help of Annotation @FunctionalInterface
*/
@FunctionalInterface
interface A{
    void m1();
    default void show(){
        System.out.print("It's a functional interface default method ");
    }
}
public class Test2{
    public static void main(String []args){
        A obj = ()->{ System.out.print("It's a m1 method of interface");
                };
        obj.m1();
    }
}