import java.util.*;
public class Area_of_circle_01 {
    public static void main(String[] args) {

        // Are of Circle Formula is = A = \pi r^2
        Scanner input = new Scanner(System.in);
        float pi = 3.14f;
        int r = input.nextInt();
        System.out.println("The Area of the Circle A = " + pi * (Math.pow(r, 2)));
    }
}