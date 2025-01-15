/* Write a program to store your shopping details in a binary file(shopping.dat) with
information itemName, price, quantity. (Use ObjectOutputStream to store Item class
object).
*/
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;
class Shopping implements Serializable{
    private String itemName ; 
    private int price;
    private int quantity;
    public Shopping(String itemName , int price , int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString(){
        return itemName+" "+price +" "+quantity;
    }
}
public class Q7{
    public static void main(String[]args){
        Shopping shop1 = new Shopping("DryFruits" , 800 , 5);
        Shopping shop2 = new Shopping("Grocery" , 500 , 4);
        Shopping shop3 = new Shopping("Mango" , 800 , 12);
        Shopping shops[] = {shop1 , shop2 , shop3};
        File f = new File("shopping.dat");
        try{
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            for(Shopping shop : shops){
            oos.writeObject(shop);
            }
        }catch(IOException e ){
            System.out.print(e);
        }
    }
}