import java.util.Scanner;
public class HelloName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name  = input.next();
        System.out.println("Hello! " + name);
    }
}
