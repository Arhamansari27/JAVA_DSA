import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int num2 = input.nextInt();
        System.out.print("Enter the operator : ");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println("The sum is " + (num1 + num2));
        } 
        else if (operator == '-') {
            System.out.println("The difference is " + (num1 - num2));
        }
        else if (operator == '*') {
            System.out.println("The multiplication is " + (num1 * num2));
        }
        else if (operator == '/') {
            System.out.println("The division is " + (num1 / num2));
        }
    }
}
