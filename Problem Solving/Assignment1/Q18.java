// Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day, how much distance does he cover in a day in km?
public class Q18 {
    public static void main(String[] args) {
        //First we take perimeter of the rectangle 
        int length = 50;
        int breadth = 30;
        int perimeter = 2*(length+breadth);
        System.out.println("The perimeter of the rectangular park is -: "+perimeter);
        // Calculate the total distance Ron covers in 10 rounds
        int total = perimeter*10;
            // Convert the total distance to kilometers
        float km = total/1000.f;
        System.out.println("If ron take 10 round of the park in a day so they will cover total distance in a day -: "+km+"km");
    }
}
