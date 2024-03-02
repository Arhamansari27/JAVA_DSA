import java.util.*;

public class Factors_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("These are factors of number : " + i);
            }
        }
    }
}
