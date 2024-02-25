import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Loops

        // For Loop

        // 1-> We use For Loop when we know how many times the loop will execute

        // int number = input.nextInt();
        // for (int num = 1; num <= number ; num++){
        // System.out.println(num);
        // }

        // While Loop

        // 1-> We use the While Loop when we don't know how many times the loop will
        // execute

        // System.out.print("Enter the number : ");
        // int number = input.nextInt();
        // System.out.println("Descending order of the number is " );
        // while (number > 0) {
        // System.out.println(number);
        // number--;
        // }

        // Do While Loop

        // 1-> We use Do while Loop when we have to execute the loop at least one time.
        int n = 1;
        do {
            System.out.println("Hello World!");
        } while (n != 1);
    }
}
