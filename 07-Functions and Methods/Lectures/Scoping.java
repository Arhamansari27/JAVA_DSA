import java.util.*;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            // int a = 89;
            // We cannot initialize the same refrenece variable again .

            a = 18;
            // But we modify the value of the variable.

            int c = 90;
            // If we initialize a new variable in the box we cannot access this variable
            // outside the box and also we can initialize the same refrence variable again
            // from outside the box.

            System.out.println(c);
        }

        int c = 199;
        System.out.println(c);
    }

    static void scopes() {
        int a = 12;
        // It means we can access the same variable outside the function

        // It means we cannot access the variable outside the function.
        // System.out.println(c);
    }
}
