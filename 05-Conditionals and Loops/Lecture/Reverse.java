import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        int reversein;
        while (n > 0) {
            int rem = n % 10;
            reversein = rem;
            n = n /10;
            System.out.print(reversein);
        }
    }
}
