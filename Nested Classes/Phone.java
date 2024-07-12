//Local Class in java 
public class Phone{
    // this is a method of class
    public void samsung(){
        System.out.println("It's a samsung Method ");
        //It's a Local Class 
        class SamsungS_24{
            //Private field in the local inner class
            private int camera ;
            private String display;
            //Constructor of Local class 
            public SamsungS_24(int camera , String display){
                this.camera = camera ; 
                this.display= display;
            }
            public void camera(){
                System.out.println(camera+"MP");
            }
            public void display(){
                System.out.println("Display Resolution "+display);
            }
        }
        //Fistly We want to create object of the local class inside the method and outside the class
        SamsungS_24 obj = new SamsungS_24(108 , "2850*1920");
        obj.camera();
        obj.display();
    }
    public static void main (String[] args){
        Phone obj = new Phone();
        obj.samsung();
    }
}
 class A {
    void Hello(){

    }
}