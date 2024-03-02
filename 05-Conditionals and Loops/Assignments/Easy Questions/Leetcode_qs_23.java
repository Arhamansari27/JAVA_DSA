public class Leetcode_qs_23 {
    public static void main(String[] args) {

        int n = 234;
        int sum = 0;
        int pd = 1;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem;
            pd = pd * rem;
        }
        int ans = pd - sum;
        System.out.println(ans);
    }
}
