import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int n = gain.length;
        int result[] = new int[n + 1];
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum = sum + gain[i];
            result[i] = sum;
        }
        int maxval = result[0];
        for (int i = 1; i < result.length; i++) {
            if (result[i] > maxval) {
                maxval = result[i];
            }
        }
        System.out.println(maxval);
    }
}

// LeetCode Solution

// class Solution {
//     public int largestAltitude(int[] gain) {
//         int n = gain.length;
//         int [] ans = new int [n + 1];
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             sum += gain[i];
//             ans[i] = sum;
//         }
//         int max = ans[0];
//         for(int i = 1; i < ans.length; i++){
//             if(ans[i] > max){
//                 max = ans[i];
//             }
//         }
//         return max;
//     }
// }
