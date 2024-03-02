import java.util.*;

public class Fibonacci_Series_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = in.nextInt();
        while (n != 0) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            n--; 
        }
    }
}
