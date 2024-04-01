import java.util.*;

public class Q6 {
  public static void main(String[] args) {
    int[] arr = { 2, 5, 1, 3, 4, 7 };
    int n = 3;
    int len = arr.length;
    int [] ans = new int[len];
    for (int i = 0; i < len; i++) {
      ans[2 * i] = arr[i];
      ans[2 *i + 1] = arr[i+n];
    }
  }
}

// LeetCode Solution

// class Solution {
//   public int[] shuffle(int[] nums, int n) {
//       int len = nums.length;
//       int [] ans = new int [len];
//       for(int i = 0; i < n; i++){
//           ans[2*i] = nums[i];
//           ans[2*i + 1] = nums[i + n];
//       }
//       return ans;
//   }
// }
