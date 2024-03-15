import java.util.*;

public class Shadowing {
    static int x = 100;

    public static void main(String[] args) {
        System.out.println(x);

        int x ; // the class variable at line 4 is shadowed by this
        x = 50; // Scope will begin when the value is initialize.
        System.out.println(x);

        fun();
    }

    static void fun() {
        // System.out.println(x);
        System.out.println(x);
    }
}
