import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        int[] nums = { 555,901,482,1771 };

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int numsdigits = (int) (Math.log10(nums[i]) + 1);
            if (numsdigits % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
