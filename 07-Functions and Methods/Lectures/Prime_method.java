import java.util.*;

public class Prime_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean primenumber = true;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                primenumber = false;
                break;
            }
        }
        if (primenumber) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime Number");
        }
    }
}