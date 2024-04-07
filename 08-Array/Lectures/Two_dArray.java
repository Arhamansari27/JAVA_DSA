import java.util.*;

public class Two_dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // One Method

        // int row = sc.nextInt();
        // int col = sc.nextInt();

        // int[][] twod = new int[row][col];

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // twod[i][j] = sc.nextInt();
        // System.out.print(twod[i][j] + " ");
        // }
        // System.out.println();
        // }

        int[][] newarr = {
                { 1, 2, 3, 6 , 7 ,8 ,9},
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // for (int i = 0; i < newarr.length; i++) {
        //     for (int j = 0; j < newarr[i].length; j++) {
        //         System.out.print(newarr[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // For each Loop

        // for (int[] iterate : newarr) {
        //     System.out.println(Arrays.toString(iterate));
        // }

        String [][] stringarr = {
            {"Muhammad"},
            {"Arham"},
            {"Ansari"}
        };
        for (String[] arrraystrings : stringarr) {
            System.out.println(Arrays.toString(arrraystrings));
        }
    }
}