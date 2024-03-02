import java.util.*;

public class Volume_of_pyramid_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();
        System.out.println("This Volume of Pyramid is " + (l * w * h) / 3);
    }
}
