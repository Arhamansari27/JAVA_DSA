import java.util.*;
public class Area_of_triangle_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Area of triangle A = ½ (b × h) square units
        int h = input.nextInt();
        int b = input.nextInt();
        System.out.println("Area of Triangle is : " + (b * h) / 2);
    }
}
