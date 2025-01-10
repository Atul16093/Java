package Collection;

/*WAP to store string data in arraylist and convert all the names into upper case which starts from a. */
import java.util.ArrayList;
import java.util.ListIterator;
public class P1 {
    public static void main(String[] args) {
        ArrayList <String>al = new <String> ArrayList();
        al.add("Atul");
        al.add("Rohan");
        al.add("Ajay");
        al.add("Goutam");
        al.add("jayesh");
        /*
        for(String s : al){
            if(s.startsWith("A") || s.startsWith("a")){
                s = s.toUpperCase();
            }
            System.out.println(s);
        }
        */
        // listIterator() method return a object ;
        ListIterator<String> lit = al.listIterator();
         while (lit.hasNext()) {
            String s =(String) lit.next();
            if(s.startsWith("A"))
                s = s.toUpperCase();
                lit.set(s);
         }
         System.out.println(al);
    }
}
