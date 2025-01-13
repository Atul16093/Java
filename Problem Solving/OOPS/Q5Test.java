/*
  Create an Object having two properties and four behaviours
(add,substract,multiply,divide) to perform desired operation.object must have setter and getter and keep all properties private.

 */
class Calculate{
    private int a;
    private int b;
    public Calculate(int a , int b){
        this.a = a;
        this.b = b;
    }
    public void setA(int a){
        this.a = a ;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getA(int a){
        return a;
    }
    public int getB(int b){
        return b;
    }
    public int add(){
        return a+b;
    }
    public int multiply(){
        return a*b;
    }
    public int divide(){
        return a/b;
    }
    public int sub(){
        return a-b;
    }

}
public class Q5Test {
    public static void main(String[] args) {
        Calculate c = new Calculate(4, 5);
       int result = c.add();
       System.out.println(result);
    }
}
