import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int a = 5;
        int fact = 1;
        int mult = 1;
        while (mult < a) {
            mult++;
            fact = fact * mult;
        }
        System.out.println(fact);
    }
}
