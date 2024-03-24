import java.util.*;

public class Array_Function {
    public static void main(String[] args) {
        // Arrays are mutable in Java and Strings are immutable in Java
        // Mutable means we can change the object.

        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.print(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        // We made this function for modification.
        arr[1] = 18;
    }
}
