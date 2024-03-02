import java.util.*;

public class Volume_of_prism_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // The general formula for the volume of any prism is:
        // Volume = Area of Base × Height

        int b = in.nextInt();
        int h = in.nextInt();
        System.out.println("The volume of prism is " + (b * h));
    }
}