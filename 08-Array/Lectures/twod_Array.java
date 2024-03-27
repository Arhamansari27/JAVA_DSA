import java.util.*;

public class twod_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input and Output of 1d Array

        // int[] arr = { 1, 2, 3, 4, 5 };

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // System.out.print(arr[i] + " ");
        // }

        // Imagine 2d Array as an Array of Arrays.

        int[][] arr2d = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // 1st method of output

        System.out.println((arr2d[0][1]));

        int[][] arr2D = new int[3][];

        // 2nd Method of input and output

        // System.out.println("Enter the Array : ");
        // for (int row = 0; row < arr2D.length; row++) {
        //     for (int col = 0; col < arr2D[row].length; col++) {
        //         arr2D[row][col] = in.nextInt();
        //         System.out.print(arr2D[row][col] + " ");
        //     }
        //     System.out.println();
        // }

    }
}
