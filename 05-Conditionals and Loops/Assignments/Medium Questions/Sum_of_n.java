import java.util.*;
public class Sum_of_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers (untill press 0): ");
        int sum = 0;

        while (true) {
            int number = in.nextInt();  
            if (number == 0) {
                break;
            }
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
