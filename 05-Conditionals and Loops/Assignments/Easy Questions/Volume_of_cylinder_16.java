import java.util.*;

public class Volume_of_cylinder_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // The formula to calculate the volume of a cylinder is:
        // Volume = π × r^2 × h

        float pi = 3.14f;
        float r = in.nextInt();
        float h = in.nextInt();

        System.out.println("Volume of Cylinder is " + (Math.pow(r, 2)) * h * pi);
    }
}
