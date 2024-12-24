/*
 * WhenEver we're talking about parent child relation, so there one keyword always come that name is super keyword in the below Program
 * or any other program, whenever child class constructor object created, and if it was a defalut constructor of the child class
 *  so It'll go to there super class and finding the defaul constructor for calling , cause in the every default construtor
 *  super keyword by default implemented.
 */

class A{
    public A(){
        System.out.println("Hello I'm Contructor of A class");
    }
}
class B extends A{
  public B(){
    System.out.println("Hello I'm B Class Contructor");
  }
}
public class P1{
    public static void main(String []args){
        B obj = new B();
        
    }
}