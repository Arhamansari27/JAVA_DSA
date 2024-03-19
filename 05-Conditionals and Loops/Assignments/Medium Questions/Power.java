import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number =  in.nextInt();
        System.out.print("Enter the power : ");
        int power = in.nextInt();
        System.out.println(Math.pow(number, power));
    }
}
