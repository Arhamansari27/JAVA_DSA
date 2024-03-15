import java.util.*;;

public class OverLoading {
    public static void main(String[] args) {
        function(18 , 20 , "Muhammad " , "Arham " , "Ansari");
        function(90, 10);
    }

    static void function(int a , int b , String ...s) {
        System.out.println(a + " " + b);
        for (String str : s){
            System.out.print(str);
            System.out.println(" ");
        }
    }

    static void function(int a, int b) {
        System.out.println(a + b);
    }
}
