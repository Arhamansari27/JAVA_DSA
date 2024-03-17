import java.util.*;
public class Natural_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        sum_natural(number);
    }
    static int sum_natural(int num){
        int i = 1;
        int n = num;
        int sum = 0;
        while (n >= i) {
            System.out.println(i);
            sum = sum + i; 
            i++;
        }
        System.out.println(sum);
        return sum;
    }
}
