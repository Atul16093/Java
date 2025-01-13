// How to update and retrive  the value of a particular property of an object from anothor class(Let suppose the property is private) ?
class Update{
    private int a;
    public Update(int a){
        this.a = a;
    }
    public void setUpdate(int a){
        this.a = a;
    }
    public int getRetrive(){
        return a;
    }
}
public class Q4Test {
    public static void main(String[] args) {
        Update obj = new Update(5);
        obj.setUpdate(6);
        int result = obj.getRetrive();
        System.out.println(result);
    }
}
