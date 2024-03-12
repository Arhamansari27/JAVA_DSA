import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // In Java We call Functions as Methods. 

        // Q: Input the 2 numbers and print the sum.

        // This is the simple way but if we want it 10 times the code looks very ugly.

        // Scanner input = new Scanner(System.in);
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // System.out.println(num1 + num2);


        greeting();
    } 

    static void greeting(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Greeting message : ");
        String greet = in.next();
        System.out.println(greet);
    }
}