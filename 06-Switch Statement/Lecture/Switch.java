import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fruit Switch Statement

        // System.out.print("Enter the fruit name : ");
        // String str = input.next();
        // switch (str) {
        // case "mango":
        // System.out.println("King of Fruits");
        // break;
        // case "apple":
        // System.out.println("Red Color Fruit");
        // break;
        // case "orange":
        // System.out.println("Rounded Fruit");
        // break;
        // case "banana":
        // System.out.println("Yellow Color Fruit");
        // break;
        // default:
        // System.out.println("Enter the valid fruit name and check spell.");
        // break;
        // }

        // Week Name

        // System.out.print("Enter the number of day : ");
        // int week = input.nextInt();
        // switch (week) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tueday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Enter valid day number");
        // break;
        // }

        // Weekend Practice

        // System.out.print("Enter the number of day : ");
        // int week = input.nextInt();
        // switch (week) {
        // case 1:
        // case 2:
        // case 3:
        // case 4:
        // case 5:
        // System.out.println("Weekday");
        // break;
        // case 6:
        // case 7:
        // System.out.println("Weekend");
        // break;
        // default:
        // System.out.println("Enter valid day number ");
        // break;
        // }

        // Months Practice

        System.out.print("Enter the number of month : ");
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feburary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter valid month number..!!");
                break;
        }
    }
}
