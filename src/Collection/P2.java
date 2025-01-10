package Collection;

import java.util.ArrayList;
import java.util.ListIterator;
public class P2 {
    public static void main(String[] args) {
        ArrayList <Integer> al= new ArrayList<>();
        al.add(456);
        al.add(12);
        al.add(457);
        al.add(31);
        al.add(98);
        ListIterator <Integer> lit = al.listIterator();
        while (lit.hasNext()) {
            Integer n = lit.next();
            if(n%2 != 0){
                lit.remove();
            }
        }
        System.out.println(al);
    }
}