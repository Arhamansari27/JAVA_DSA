import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        fact(6);
    }
    static int fact(int num){
        int number = num;
        int prd = 1;
        for (int i = 1; i <= number; i++) {
            prd = prd * i;
        }
        System.out.println(prd);
        return prd;
    }
}
