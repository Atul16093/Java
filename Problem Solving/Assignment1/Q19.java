// A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume?

public class Q19 {
    public static void main(String[] args) {
        // Firstly we need volume of cube
        // formula of volume of cube = a*a*a;
        int a = 7;
        int volume_cube = a * a * a;
        System.out.println("The volume of cube is -: " + volume_cube);
        int l = 7;
        int b = 4;
        int h = 8;
        //Now need the volume of cuboid 
        int volume_cuboid = l * b * h;
        System.out.println("The volume of cuboid is -: " + volume_cuboid);
        if (volume_cube > volume_cuboid) {
            System.out.println("The volume of cube is greater -: " + volume_cube);
        } else if (volume_cube == volume_cuboid) {
            System.out.println("The volume of cube or cuboid are equal");
        } else {
            System.out.println("The volume of cuboid is greater -: " + volume_cuboid);

        }

    }
}
