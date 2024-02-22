import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number in Rupees ");
        int rupees = input.nextInt();
        System.out.println("Your USD is " + (rupees / 83.333));
    }
}
