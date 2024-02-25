import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Gender : ");
        String str = input.next();
        if (str.equals("male")) {
            System.out.print("Enter your Salary : ");
            int salary = input.nextInt();
            if (salary >= 20000) {
                System.out.println("You are Male and you got bonus of 2000");
            }
            else{
                System.out.println("Your salary is below than 20000 so you are not elligible");
            }
        }
        else if (str.equals("female")) {
            System.out.print("Enter your Salary : ");
            int salary = input.nextInt();
            if (salary > 10000) {
                System.out.println("You are Female and you got bonus of 1000");
            }
            else{
                System.out.println("Your salary is below than 10000 so you are not elligible");
            }
        }
        else{
            System.out.println("You are neither a male nor a female and you are not elligible");
        }
    }
}