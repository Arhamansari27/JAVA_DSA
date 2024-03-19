import java.util.*;

public class Distance {
    public static void main(String[] args) {

        // Distance = (x2 - x1)2 + (y2 - y1)2

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the x1 : ");
        int x1 = in.nextInt();
        System.out.print("Enter the x2 : ");
        int x2 = in.nextInt();
        System.out.print("Enter the y1 : ");
        int y1 = in.nextInt();
        System.out.print("Enter the y2 : ");
        int y2 = in.nextInt();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y1 - y2, 2));
        System.out.println("The distance between two points are : " + distance);
    }
}
