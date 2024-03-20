import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = in.nextInt();
        int orgnum = number;
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            int value = (rem * rem * rem);
            number = number / 10;
            sum = sum + value;
        }
        if (orgnum == sum) {
            System.out.println(orgnum + " is a Armstrong number.");
        }
        else{
            System.out.println(orgnum + " is not a Armstrong number.");
        }
        // System.out.println(sum);
    }
}
