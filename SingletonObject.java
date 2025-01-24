package Java;
class Focus {

    // Creating a varible for holding the singletonObject
    private static Focus stObject;

    // making the constructore private
    private Focus() {

    }
    public static Focus getInstance(){
        // st stands for singleton
        if(stObject == null){
            stObject = new Focus();
        }
        return stObject;
    }
    public void display(){
        System.out.println("Access this method by the help of singleton object ");
    }
}

public class SingletonObject {
    public static void main(String[] args) {
        Focus obj = Focus.getInstance();
        obj.display();
    }
}