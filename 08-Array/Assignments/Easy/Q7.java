import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int len = nums.length;
        int[] result = new int[len];
        
        for (int i = 0; i < nums.length; i++) {
            int maxVal = nums[i];
            int count = 0;
           for (int j = 0; j < nums.length; j++) {
             if (maxVal > nums[j]) {
                count++;
             }
           }
           result[i] = count;
        }
        System.out.println(Arrays.toString(result));
    }
}


// LeetCode Solution

// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
//         int len = nums.length;
//         int ans[] = new int[len];
//         for(int i = 0; i < len; i++){
//             int maxVal = nums[i];
//             int count = 0;
//             for(int j = 0; j < len; j++){
//                 if(maxVal > nums[j]){
//                     count++;
//                 }
//             }
//             ans[i] = count;
//         }
//         return ans;
//     }
// }