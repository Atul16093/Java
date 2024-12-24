/*
 * We can use super keyword  for setting the value into the parent class method, by using child class method.
 */

 class A{
    int a ;
    public void setID(int a){
        this.a = a ;
    }
}
class B extends A {
    int a;
    public void set(int a , int b){
        super.setID(b);
        this.a  = b;
        System.out.println(a+super.a);
    }

}
public class P3{
    public static void main(String[] args) {
        B obj = new B();
        obj.set(400,200);
    }
}