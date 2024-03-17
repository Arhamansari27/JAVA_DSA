import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
