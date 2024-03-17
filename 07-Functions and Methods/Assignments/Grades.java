import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int numbers = input.nextInt();
        marks(numbers);
    }

    static int marks(int number) {
        int num = number;
        if (num >= 91) {
            System.out.println("You got AA grade");
        } else if (num >= 81) {
            System.out.println("You got AB grade");
        }
        else if (num >= 71) {
            System.out.println("You got BB grade");
        }
        else if (num >= 61) {
            System.out.println("You got BC grade");
        }
        else if (num >= 51) {
            System.out.println("You got CD grade");
        }
        else if (num >= 41) {
            System.out.println("You are fail.");
        }
        return num;
    }
}
