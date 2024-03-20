import java.util.*;
public class Interest{
    public static void main(String[] args) { 

        // A = P(1 + r/n)^(nt)

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of P : ");
        double p = in.nextDouble();
        System.out.print("Enter the value of r : ");
        double r = in.nextDouble() / 100;
        System.out.print("Enter the value of n : ");
        double n = in.nextDouble();
        System.out.print("Enter the value of t : ");
        double t = in.nextDouble();

        double ans = p * Math.pow((1 + r/n) , (n*t));
        System.out.println("Your Compound Interest is : " + ans);
    }
}