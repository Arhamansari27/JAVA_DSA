import java.util.*;

public class Volume_of_sphere_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // The formula to calculate the volume of a sphere is:
        float pi = 3.14f;
        float r = in.nextInt();
        System.out.println("Volume of Sphere is " + ((Math.pow(r, 3)) * pi * 4) / 3);
    }
}
