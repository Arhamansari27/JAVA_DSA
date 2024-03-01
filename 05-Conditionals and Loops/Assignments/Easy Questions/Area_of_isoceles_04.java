import java.util.*;

public class Area_of_isoceles_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Area Of Isosceles Triangle = b * h / 2

        int b = input.nextInt();
        int h = input.nextInt();
        System.out.println("Area of Isosceles Triangle is " + (b * h) / 2);
    }
}