import java.util.Scanner;

public class Print_Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input_number = input.nextInt();
        for (int i = 2; i < input_number; i++) {
            if (print(i)) { // Call print method for each i, not for input_number
                // System.out.println(i + " ");
            }
        }
    }

    static boolean print(int prime) { // Changed return type to boolean
        boolean isprime = true;
        for (int i = 2; i < prime; i++) { // Changed number to prime
            if (prime % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println(prime + " is a prime number.");
        } else {
            System.out.println(prime + " is not a prime number.");
        }
        return isprime; // Return the result of primality check
    }
}
