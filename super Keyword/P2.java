/*
 * We can use super keyword as an variable for setting the varible value into the parent class.
 */

class A{
    int a ;
}
class B extends A {
    int a;
    int c;
    public  B(){

    }
    public B(int a , int b){
        super.a = a;
        this.a = b;
    }
    public void sum(){
         c = super.a+a;
    }
    public void display(){
        System.out.print(c);
    }

}
public class P2{
    public static void main(String[] args) {
        B obj = new B(400 , 200);
        // obj.setData(400,200);
        obj.sum();
        obj.display();
    }
}