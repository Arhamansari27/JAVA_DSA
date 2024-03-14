import java.util.*;

public class Swap_Method {
    public static void main(String[] args) {
        String myname = "Arham Ansari";
        String newmethod = name(myname);
        System.out.println(newmethod);

        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static String name(String naam) {
        String name2 = "Muhammad Arham";
        return naam;
    }
}
