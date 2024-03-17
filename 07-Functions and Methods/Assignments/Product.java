import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int number1 = in.nextInt();
        System.out.print("Enter the 2nd number : ");
        int number2 = in.nextInt();
        prd(number1, number2);
    }
    static int prd(int num1 , int num2){
        int ans = num1*num2;
        System.out.print(ans);
        return ans;
    }
}
