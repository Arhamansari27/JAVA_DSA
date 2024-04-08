import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Input_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int arr[] = new int[5];
        // arr[0] = 11;
        // arr[1] = 22;
        // arr[2] = 33;
        // arr[3] = 44;
        // arr[4] = 55;


        // First Way to print Array

        // System.out.print("Enter the Array indexes : ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // }
        // System.out.println("Your complete array are ");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // Second way to Print Array

        // System.out.println(Arrays.toString(arr));


        String str [] = new String[3];
        System.out.print("Enter your String : ");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.print("Your String is ");
        for (int i = 0; i < str.length; i++) {
            str[2] = "Ansari";
            System.out.print(str[i] + " ");
        }
    }
}
