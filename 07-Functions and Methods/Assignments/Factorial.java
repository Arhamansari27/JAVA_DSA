import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
        fac(number);
    }
    static int fac(int num){
        int number = num;
        int prd = 1;
        for (int i = 1; i <= number; i++) {
            prd = prd * i;
        }
        System.out.println(prd);
        return prd;
    }
}
