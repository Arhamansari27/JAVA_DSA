import java.util.*;

public class TypeChecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // A to Z = 65 to 90
        // a to z = 97 to 122
        System.out.print("Enter the character : ");
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");           
        }
        else{
            System.out.println("UpperCase");
        }
    }
}
