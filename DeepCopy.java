package Java;
/*
Deep Copy: A deep copy creates a new object and also duplicates the elements from the original object,
 instead of copying references. In the case of a collection, it creates new instances of the objects within
  the collection. Changes to the deep copy do not affect the original object because they are completely independent.

 */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DeepCopy {
    int i = 0;
    public DeepCopy(int i){
        this.i = i;
    }
    @Override
    public String toString(){
        return "[ " + i +"]";
    }
    public static void main(String []args){
        //Original object 
        //all the wrapper classes in java is immutable 
        ArrayList <DeepCopy>  originalObj = new ArrayList<>();
        originalObj.add(new DeepCopy(45));
        originalObj.add(new DeepCopy(65));
        originalObj.add(new DeepCopy(100));
        System.out.println(originalObj);
        //Deep copy (In Deep copy refrence will be different & object will be different );
        //Deep copy took origanl object as an collection but doesn't modify the original object value 
        ArrayList <DeepCopy> DeepObj = new ArrayList<DeepCopy>(originalObj);
        /*Deepcopy (Here we'll change the value from the help of Deep copy refrence and we'll
         able to see that changes doesn't change the original object) */
        DeepObj.get(1).i = 1000;
         System.out.println(originalObj);
         System.out.println();
    }
}
