import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int num2 = input.nextInt();
        if (num1 > num2 ) {
            System.out.println("num1 is greater than num2");
        }
        else if (num1 == num2) {
            System.out.println("num1 and num2 are equal");
        }
        else {
            System.out.println("num2 is greater than num1");
        }
    }
}
