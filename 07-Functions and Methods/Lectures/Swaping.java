import java.util.*;
public class Swaping {
    public static void main(String[] args) {
        int []  arr = {1 , 3 ,4 ,5 ,6};
        Array(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Array(int[] numbers) {
        numbers[0] = 99;
        numbers[1] =12;
    }
}
