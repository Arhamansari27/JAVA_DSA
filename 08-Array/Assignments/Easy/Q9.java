import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,0};
        int [] indexes = {0,1,2,3,0};
        int len = nums.length;
        int [] result = new int [len];

        for (int i = 0; i < nums.length ; i++) {
            // System.out.print(nums[i] + " ");
            // System.out.print(indexes[i] + " ");
            result[i] = nums[indexes[i]];
            System.out.println(result[i]);
        }
    }
}
