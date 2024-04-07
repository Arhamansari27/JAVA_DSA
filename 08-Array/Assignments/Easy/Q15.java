import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }; 

        int len = matrix.length;

        int[][] ans = new int[len][len];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
    }
}

// LeetCode Solution

// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;

//         int[][] ans = new int[m][n];

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 ans[j][i] = matrix[i][j];
//             }
//         }
//         return ans;
//     }
// }
