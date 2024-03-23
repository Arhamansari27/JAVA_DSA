import java.util.*;

public class twod_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Two D Array means Array in Array

        // int[][] twod = {
        // { 1, 2, 3 },
        // { 4, 5, },
        // { 6, 7, 8, 9 }
        // };

        // System.out.println(Arrays.toString(twod[2]));

        // Printing 2D array

        // for (int i = 0; i < twod.length; i++) {
        // System.out.println(Arrays.toString(twod[i]));
        // }

        int[][] arr2d = new int[3][3];

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = in.nextInt();
            }
        }
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
        }
    }
}
