//Anonymous Class In java typically used when we need a short-lived object with specific behaviour , such as handling events or implementing small interfaces
//Creating an  interface 
interface A{
    //Inteface method would be by default public
    void m2();
    void m3();
}
//Creating a static nested class 
class B {
    private static int a =20 ;
    static class C{
        public void m4(){
            System.out.println("M4 method of the static nested class");
        }
    }
}
public class Anonymous{
    //Method of Normal class
    public void m1(){ 
        System.out.print("It's a m1 method");
         }
    public static void main(String []args){
        // Creating an Anonymous Class ,  Syntax  is new Anonymous(){};
        Anonymous obj = new Anonymous(){
            //Override the m1 method from the Normal class
            public void m1(){
                 System.out.println("It's a Overided method of the Anonymous "); 
                 }
        };
        // calling m1 method
        obj.m1();
        //Creating an anonymous class of the interface
        //We are writing new A() for telling the compiler creating an anonymous class of A();
        A obj1 = new A(){
            public void m2(){
                System.out.println("This is a m2 method of the interface ");
            }
            public void m3(){
                System.out.println("This is a m3 method of the interface ");
            }
        };
        obj1.m2();
        obj1.m3();
        //Object of static nested class
        B.C obj3 = new B.C(){
            public void m4(){
                System.out.println("This is a m4 method of nested static Anonymous class");
            }
        };
        obj3.m4();
    }
}