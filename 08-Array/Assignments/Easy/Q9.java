import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,0};
        int [] indexes = {0,1,2,3,0};
        int len = nums.length;
        int [] result = new int [len];

        for (int i = 0; i < nums.length ; i++) {
            result[i] = nums[indexes[i]];
            System.out.println(result[i]);
        }
    }
}

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int [] ans = new int [len];
        for(int i = 0; i < len; i++){
            for (int j = len - 1; j > index[i]; j--) {
                ans[j] = ans[j - 1];
            }
            ans[index[i]] = nums[i];
        }
        return ans; 
    }
}