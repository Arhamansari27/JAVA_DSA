import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 9, 5 },
                { 7, 1, 3 },
                { 2, 8, 7 }
        };
        int len = arr.length;
        int[] newarr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                newarr[i] = sum;
            }
        }
        int max = newarr[0];
        for (int i = 1; i < newarr.length; i++) {
            if (newarr[i] > max) {
                max = newarr[i];
            }
        }
        System.out.print(Arrays.toString(newarr));
        System.out.println();
        System.out.println(max);
    }
}

// LeetCode Question 4

// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int len = accounts.length;
//         int newarr[] = new int[len];
//         for(int i = 0; i < accounts.length; i++){
//             int sum = 0;
//             for(int j = 0; j < accounts[i].length; j++){
//                 sum = sum + accounts[i][j];
//                 newarr[i] = sum;
//             }
//         }
//         int maxval = newarr[0];
//         for(int check = 0; check < newarr.length; check++){
//             if(newarr[check] > maxval){
//                 maxval = newarr[check];
//             }
//         }
//         return maxval;
//     }
// }