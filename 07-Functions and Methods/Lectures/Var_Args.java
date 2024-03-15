import java.util.*;

public class Var_Args {
    public static void main(String[] args) {
        // function(1 , 3,4 ,4,5,6,47,76,6534,4324,345,2,233,43);
        function();
        multiple(10, 20, "Muhammad ", "Arham ", "Ansari");
    }

    static void multiple(int a, int b, String... s) {
        System.out.println(a + " " + b);
        
        for (String str : s) {
            System.out.print(str);
        }
        // We use for loop there because we don't know how much values will give from
        // the user.
    }

    static void function(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
