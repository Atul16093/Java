// In java we can call static method by obj and also called by class name , call by class name is the best option to call static method or variable in java as further requirment cause object take memory 
class Test {
    // creating a static method
    static void m1() {
        // That m2() method is a instance method so bacically we cann't call and write m2() method
        // in the static method otherwise java compiler genrate an error.
        // m2();
        // Local member cann't be static
        // static int a = 10; ----> //It's a Local member this cann't be static
        System.out.println("That's a static method ");
    }

    // creating a non-static method
    public void m2() {
        System.out.println("Non static method");
    }
}

public class Static_For_Method {
    public static void main(String[] args) {
        // Don't preferd this if any method have static
        Test t = new Test();
        // t.m1();
        // preferd call by class name
        Test.m1();
    }
}
