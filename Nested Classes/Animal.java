public class Animal{
        // We can access outer class private member too in the inner class
        private int a  = 4 ;
        //Method of outer class
        public void walk(){
            System.out.println("Walking...");
        }
        //Instance Inner class 
        class Cat{
            private String name ;
            private int Weight;
            //Parameterise constructor 
            public Cat(String name , int  Weight){
                this.name = name ;
                this.Weight = Weight;
            }
            public void sleep(){
                System.out.println("cat is sleeping for "+a+" hours");
                }
                //Creating two getter method 
            public String getName(){
                return name ;
                 }
            public int getWeight(){
                return Weight;
            }
            }
    public static void main(String []args){  
       //There are two ways to create obj of inner class  
       // First way According to me first way is best 
       
       Animal obj1 = new Animal();
       Animal.Cat obj2 = obj1.new Cat("Linux", 4);
       obj2.sleep();
       obj1.walk();
       //Printing the name and the weight of the cat
       System.out.print("The Cat Name is -: "+obj2.getName() +" And the Weight is -: "+obj2.getWeight());
      // Second way From the second way we only access the member of inner class 
      /*
       Animal.Cat obj  = new Animal().new Cat();
       obj.sleep();
       */
    }
}