// Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
public class Q23 {
    public static void main(String[] args) {
        int l = 15;
        int w = 9;
        int h = 12;
        int carton = l*w*h;
        int side = 3;
        int cubical_volume = side*side*side;
        int number_of_carton = carton/cubical_volume;
        System.out.println("The total number of cubic inside the carton is -: "+number_of_carton);
    }
}
