import java.util.*;

public class String_method {
    public static void main(String[] args) {
        // String msg = greet();
        // System.out.println(msg);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.next();
        String newmsg = mygreet(name);
        System.out.println(newmsg);
    }

    static String mygreet(String name) {
        String greet = "Hello " + name;
        return greet;
    }

    static String greet() {
        String greeting = "Hello How are you?";
        return greeting;
    }
}