import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int num2 = in.nextInt();
        System.out.print("Enter the Operation : ");
        char opt = in.next().trim().charAt(0);
        if (opt == '+') {
            System.out.println("The sum of 1st + 2nd is " + (num1 + num2));
        } else if (opt == '-') {
            System.out.println("The difference of 1st - 2nd is " + (num1 - num2));
        } else if (opt == '*') {
            System.out.println("The multiplication of 1st * 2nd is " + (num1 * num2));
        } else if (opt == '/') {
            System.out.println("The division of 1st / 2nd is " + (num1 / num2));
        }
        else{
            System.out.println("Please Enter Valid Opeator or Try Again..!!");
        }

    }
}
