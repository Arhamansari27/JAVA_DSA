// If the refrence variable is smaller than the assigned value it will give us the error
// Like :  int num = input.nextFloat()  ||  Then if we give us float value it give us error  

// If the refrence variable is greater than the assigned value it will not give us the error
// Like : float num = input.nextInt()  ||  Then if we give us int value it not give us error  

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Please Enter 1st Num : ");
        // int num1 = input.nextInt();
        // System.out.print("Please Enter 2nd Num : ");
        // int num2 = input.nextInt();

        // int sum = num1 + num2;
        // System.out.println("The sum of num1 + num2 = " + sum);

        // Type Casting

        // int num = (int)(67.56f);
        // System.out.println(num);

        // Automatic Type Conversion in expressions

        // int newnum = 258;
        // byte b = (byte)(newnum);
        // System.out.println(b);

        // byte a = 30;
        // byte b = 40;
        // byte c = 50;
        // int d = a * b / c;
        // System.out.println(d);

        // Long Function
        
        byte b = 50;
        char c = 'i';
        int num = 2710;
        float f = 11.20f;
        short s = 1024;
        double d = 0.533;
        double result = (f * b) + (num + c) - (s * d);
        System.out.println((s * d));
        System.out.println(result);
    }
}
