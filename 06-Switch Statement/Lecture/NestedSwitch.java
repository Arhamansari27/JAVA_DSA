import java.util.*;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int emailid = input.nextInt();
        String depart = input.next();
        switch (emailid) {
            case 1:
                System.out.println("Muhammad Arham");
                break;
            case 2:
                System.out.println("Gulshair Ahmad");
                break;
            case 3:
                System.out.println("Email Id 3");
                switch (depart) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CS":
                        System.out.println("Computer Science Department");
                        break;
                    default:
                        System.out.println("Enter valid Department");
                        break;
                }
                break;
            default:
                System.out.println("Enter valid email id");
                break;
        }
    }
}
