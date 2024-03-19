import java.util.*;

public class Discount {
    public static void main(String[] args) {

        // Discount = Original Price × Discount Percentage

        // Discount = $100 × 20/100

        // To find the discounted price, you subtract the discount from the original
        // price:

        // Discounted Price = Original Price - Discount

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your product Original Price : ");
        int org = in.nextInt();
        System.out.print("Enter your product discount percentage : ");
        int discount = in.nextInt();
        float dspercentage = (float) discount / 100;

        float finalprice = org - (org * dspercentage);
        System.out.println("Your Discount Price is " + finalprice);
    }
}
