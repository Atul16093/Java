// Can we overload the method with var-arg type of argument.answer is YES;
class TestVar{
    int a;
    int b[];
    
    void M1(int a){
        this.a=a;
        System.err.println(a);

    }
     void M1(int...b){
        this.b=b;
    } 
    public void display(){
        for(int element : b){
            System.out.println(element);
        }
    }
}


public class Q12Test {
    public static void main(String[] args) {
        TestVar t = new TestVar();
        t.M1(10 ,12,45,454);
       t.display();
    }
}