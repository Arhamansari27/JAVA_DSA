// If the refrence variable is smaller than the assigned value it will give us the error
// Like :  int num = input.nextFloat()  ||  Then if we give us float value it give us error  

// If the refrence variable is greater than the assigned value it will not give us the error
// Like : float num = input.nextInt()  ||  Then if we give us int value it not give us error  


import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter 1st Num : ");
        int num1 = input.nextInt();
        System.out.print("Please Enter 2nd Num : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of num1 + num2 = " + sum);
    }
}
