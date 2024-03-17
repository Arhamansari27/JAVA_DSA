import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        prime(number);
    }
    static int prime(int number){
        int num = number;
        boolean isprime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.print(num + " is not a prime number.");
        }
        return num;
    }
}
