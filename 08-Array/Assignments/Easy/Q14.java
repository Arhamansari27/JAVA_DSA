import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        int[] nums = { 2,7,4 };
        int len = nums.length;
        int[] ans = new int[len];
        int k =  181;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum * 10 + nums[i];
        }
        sum = sum + k;

        int i = len - 1;
        while (sum > 0) {
            int rem = sum % 10;
            sum = sum / 10;
            ans[i] = rem;
            i--;
        }

        System.out.println(Arrays.toString(ans));
    }
}

// LeetCode Solution

// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         List<Integer> list = new ArrayList<>();

//         for (int i = num.length - 1; i >= 0; i--) {

//             list.add(0, (num[i] + k) % 10);
//             k = (num[i] + k) / 10;
//         }

//         while (k > 0) {
//             list.add(0, k % 10);
//             k /= 10;
//         }
//         return list;
//     }
// }