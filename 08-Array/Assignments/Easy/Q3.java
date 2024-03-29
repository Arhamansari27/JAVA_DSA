import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        int nums[] = { 3, 1, 2, 10, 1 };
        int sum = 0;
        int len = nums.length;
        int newarr[] = new int[len];

        for (int i = 0; i < nums.length; i++) { 
            sum = sum + nums[i];
            newarr[i] = sum;
            System.out.println(newarr[i]);
        }
    }
}

// LeetCode Quetion Solution

// class Solution {
//     public int[] runningSum(int[] nums) {
//         int len = nums.length;
//         int sum = 0;
//         int newarr[] = new int[len];
//         for(int i = 0; i < len; i++){
//             sum = sum + nums[i];
//             newarr[i] = sum;
//         }
//         return newarr;
//     }
// }
