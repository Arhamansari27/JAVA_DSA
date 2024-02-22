import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        int principal = input.nextInt();
        System.out.print("Enter the Time: ");
        int time = input.nextInt();
        System.out.print("Enter the Rate : ");
        int rate = input.nextInt();
        int simpleInterest = principal * (1 + (rate*time));
        System.out.println(simpleInterest);
    }
}
