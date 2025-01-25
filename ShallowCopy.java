package Java;
/*
Shallow Copy: A shallow copy creates a new object, but it only copies the references to the original object's elements, 
not the actual elements themselves.Changes to the elements in the shallow copy affect the original object
 because they share the same memory references. */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShallowCopy {
    int i = 0;
    public ShallowCopy(int i){
        this.i = i;
    }
    @Override
    public String toString(){
        return "[ " + i +"]";
    }
    public static void main(String []args){
        //Original object 
        //all the wrapper classes in java is immutable 
        ArrayList <ShallowCopy>  originalObj = new ArrayList<>();
        originalObj.add(new ShallowCopy(45));
        originalObj.add(new ShallowCopy(65));
        originalObj.add(new ShallowCopy(100));
        //Shallow copy (In shallow copy refrence will be different but object will be same );
        ArrayList <ShallowCopy> shallowObj = (ArrayList <ShallowCopy>)  originalObj.clone();
        /*Shallow copy (Here we'll change the value from the help of shallow copy refrence and we'll
         able to see that changes happend in original object too) */
        //  shallowObj.set(1 , new ShallowCopy(1000));
        shallowObj.get(1).i = 1000;
         System.out.println(originalObj);
         System.out.println();
    }
}
