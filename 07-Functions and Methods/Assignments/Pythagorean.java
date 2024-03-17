import java.util.*;
public class Pythagorean {
    public static void main(String[] args) {

        // ( a , b , c ) where as a^2 + b^2 = c^2 

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
       check(num1, num2, num3);

    }

    static void check(int a , int b , int c){
        int fst = (a*a);
        int scnd = (b*b);
        int third = (c*c);
        int ans = (fst + scnd);
        if (fst + scnd == third) {
            System.out.println(ans + " is a pythagorean number.");
        }
        else{
            System.out.println("The number is not a pythagorean");
        }
    }
}