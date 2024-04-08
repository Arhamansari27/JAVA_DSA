import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        int[] newarr = { 9 };
        int len = newarr.length;
        int sum = 0;
        int n = 1;
        for (int i = 0; i < newarr.length; i++) {
            sum = sum * 10 + newarr[i];
        }
        sum = sum + n;

        int numDigits = (int)(Math.log10(sum) + 1);

        int[] ans = new int[numDigits];
        int i = numDigits - 1;
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
//     public int[] plusOne(int[] digits) {
//         for (int i = digits.length - 1; i >= 0; i--) {
//             if (digits[i] != 9) {
//                 digits[i]++;
//                 return digits;
//             }
//             digits[i] = 0;
//         }
//         int[] result = new int[digits.length + 1];
//         result[0] = 1;
//         return result;
//     }
// }