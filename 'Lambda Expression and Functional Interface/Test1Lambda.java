//Calling parametrise value of the interface 
interface A{
    int m1(int a , int b );
}
public class Test1Lambda{
    public static void main(String args []){
        // parameterise values
    A obj = (a , b ) -> { int c = a+b;return c;};
     System.out.print(obj.m1(4,5));
    
    }
}