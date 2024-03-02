import java.util.*;

public class Print_sum_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integers and press 0 for end : ");
        int sum = 0;
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            sum = sum + n;
        }
        System.out.println("The total sum is " + sum);
    }
}