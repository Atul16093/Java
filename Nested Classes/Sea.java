//Static Inner class in java 
public class Sea{
    //static nested class 
    static class Fish{
        private String name;
        //It's a parameterise constructor 
        public Fish(String name ){
            this.name = name ;
        }
        //Creating a getter method cause the name field is private 
        public String getName(){
            return name ;
        }
        //It's a static method we can call directly by the class name 
        public static void swim(){
            System.out.println("Swimming...");
        }
        //Non static method inside the static class
        public void eat(){
            System.out.println("Eating sth");
        }
    }
    public static void main(String []args ){
        //That's a way to call Static method inside the Static class directly
        Sea.Fish.swim();
        //Creating an object of the inner class
        Sea.Fish obj = new Sea.Fish("Gold Fish");
        //Calling the method from the help of reference 
        obj.eat();
        //Getter method 
        System.out.print("Spices of the Fish is -: "+obj.getName());
        // Sea.Fish.eat();
    }
}