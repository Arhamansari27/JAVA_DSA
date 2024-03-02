import java.util.*;
public class Largest_number_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE; // Initialize largest to smallest possible integer value
        
        while (true) {
            System.out.print("Enter an integer (enter 0 to stop): ");
            int num = scanner.nextInt();
            
            if (num == 0) {
                break;
            }
            
            if (num > largest) {
                largest = num;
            }
        }
        
        if (largest != Integer.MIN_VALUE) {
            System.out.println("The largest number entered is: " + largest);
        } else {
            System.out.println("No numbers were entered.");
        }
        
        scanner.close();
    }
}
