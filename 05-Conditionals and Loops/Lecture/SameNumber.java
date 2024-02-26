import java.util.*;;
public class SameNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                counter++;
            }
            n = n / 10;
        }
        System.out.println(counter);
    }
}
