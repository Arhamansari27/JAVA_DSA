import java.util.*;

public class amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int originalNumber = number;
        int length = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, length);
            number = number / 10;
        }

        if (sum == originalNumber) {
            System.out.println("Armstrong Number.");
        } else {
            System.out.println("Not an Armstrong Number.");
        }
    }
}
