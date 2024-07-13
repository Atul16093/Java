/*Lambda Expression in java
Lambda Expression is an anonymous function of java , That function don't have name , return type and not the modifire 
Some Key Points of Lambda Expression -: 
* If in the lambda expression body have only the one statement/ line then we can remove curly bracket {};
* In the Lambda Expression we just use the type of reference , then compiler guess the situation and the context;
* When method have only one parameter then we can remove the bracker ();
* Lambda Expression Work Only with the function Interface 
* Default Method can be multiple into the lambda expression .
*/
interface Person{
    String eat(String s);
    default void sleep(){
        System.out.print("Sleeping...");
    }
}
public class Test1{
    public static void main(String []args){
        //Creating a reference of Person interface and lambda expression
        Person obj = s -> {return s;};
        //obj.eat("Pizza"); going first to the lambda expression
       System.out.println(obj.eat("Pizza"));
       obj.sleep();
    }
}