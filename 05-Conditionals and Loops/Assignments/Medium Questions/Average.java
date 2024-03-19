import java.util.*;

public class Average {
    public static void main(String[] args) {

        // To calculate the average of N numbers, you follow these steps:

        // Add up all the numbers: Sum all the given numbers together.
        // Count the numbers: Determine how many numbers you have (N).
        // Divide the sum by the count: Divide the sum obtained in step 1 by the count
        // obtained in step 2.
        // The formula for average is:

        // Average = Sum of all numbers / Count of numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number (until you press x)");
        int sum = 0;
        int count = 0;
        while (true) {
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            sum = sum + number;
            count++;
        }
        int avg = sum / count;
       System.out.println(avg);
    }
}
