import java.util.*;

public class Area_of_cube_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // The formula to calculate the total surface area of a cube is:
        // Total Surface Area = 6s^2

        int s = in.nextInt();
        System.out.println("Total surface area of a cube is : " + 6 * (Math.pow(s, 2)));
    }
}
