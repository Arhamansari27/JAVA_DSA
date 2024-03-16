import java.util.*;

public class Prime_method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int ans = prime(input.nextInt());
    }
    static int prime(int nums){
        int nowprime = nums;
        boolean isprime = true;
        for (int i = 2; i < nowprime; i++) {
            if (nowprime % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println(nowprime + " is a prime Number");
        }
        else{
            System.out.println(nowprime + " is not a prime number");
        }
        return nowprime;
    }
}