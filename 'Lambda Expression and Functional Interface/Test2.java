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
//Main  class
public class Test2{
    public static void main(String []args){
    //In the functional interface so we just only write code of body we don't need to overide the method name like this , we just type code for body.
        /* A obj = ()->{
            public void m1(){
                System.out.print("It's a m1 method of interface");
                }
                };
        obj.m1();
        */
           A obj = ()->{System.out.print("It's a m1 method of interface"); };
        obj.m1();
        
    }
}