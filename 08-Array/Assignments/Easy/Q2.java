import java.util.*;

public class Q2 {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 1 };

    int len = nums.length;

    int result[] = new int[len * 2];

    for (int i = 0; i < nums.length; i++) {
      result[i] = nums[i];
      result[i + len] = nums[i];
      System.out.println(result[i]);
    }
  }
}


// LeetCode Code

// int[] ans = new int[2*nums.length];

// for(int i=0;i<nums.length;i++) {
//     ans[i] = nums[i];
//     ans[i+nums.length] = nums[i];
// }
// return ans;