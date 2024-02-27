import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fruit name : ");
        String str = input.next();
        switch (str) {
            case "mango":
                System.out.println("King of Fruits");
                break;
            case "apple":
                System.out.println("Red Color Fruit");
                break;
            case "orange":
                System.out.println("Rounded Fruit");
                break;
            case "banana":
                System.out.println("Yellow Color Fruit"); 
                break;
            default:
                System.out.println("Enter the valid fruit name and check spell.");
                break;
        }
    }
}

// Week Practice
// Weekend Practice
// Year Practice
// Nested Switch