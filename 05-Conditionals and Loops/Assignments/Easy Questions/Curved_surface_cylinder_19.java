import java.util.*;

public class Curved_surface_cylinder_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // The formula to calculate the curved surface area of a cylinder is:
        // Curved Surface Area = 2πrh
        float pi = 3.14f;
        int r = in.nextInt();
        int h = in.nextInt();
        System.out.println("Curved surface area of a cylinder is " + (2 * pi * r * h));
    }
}