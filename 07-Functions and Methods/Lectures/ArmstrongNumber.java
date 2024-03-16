import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int newvar = Armstrong(153);
        System.out.println(newvar);
    }

    static int Armstrong(int arms) {
        int number = arms; // Use the parameter arms instead of a hardcoded value
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int rem = number % 10;
            sum = sum + (rem * rem * rem);
            number = number / 10;
        }
        if (sum == originalNumber) { // Check against the original number
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        return sum; // Return the calculated sum, not the input number
    }
}
