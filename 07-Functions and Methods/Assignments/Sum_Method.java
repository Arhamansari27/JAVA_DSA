import java.util.*;
public class Sum_Method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = sum(num1, num2);
        System.out.println(ans);
    }
    static int sum (int first , int second){
        return first + second;
    }
}
