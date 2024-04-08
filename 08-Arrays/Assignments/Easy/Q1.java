import java.util.*;
public class Q1{
    public static void main(String[] args) {
        int [] nums = {5,0,1,2,3,4};
       
        for (int i = 0; i < nums.length; i++) {
            int newarr = nums[i];
            int ans = nums[newarr];
            System.out.print(ans + " ");
        }
    }
}


// LeetCode Answer

// class Solution {
//     public int[] buildArray(int[] nums) {
//         int len = nums.length;
//         int res[] = new int[len];
//         for(int i = 0; i < len; i++){
//             int newarr = nums[i];
//             int ans = nums[newarr];
//             res[i] = ans;
//         }
//         return res;
//     }
// }