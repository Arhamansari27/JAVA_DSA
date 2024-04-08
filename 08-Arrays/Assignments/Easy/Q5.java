import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = { 12,1,12};
        int extra = 10;
        int len = arr.length;

        boolean[] newarr = new boolean[len];

        boolean a = false;

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int ans = extra + arr[i];
            if (ans >= max) {
                a = true;
                newarr[i] = a;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}


// LeetCode Solution

// class Solution {
//     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//         int len = candies.length;
//         boolean[] newarr = new boolean[len];
//         boolean a = false;
//         int max = candies[0];
        
//         // Find the maximum value in the candies array
//         for (int i = 0; i < candies.length; i++) {
//             if (candies[i] > max) {
//                 max = candies[i];
//             }
//         }
        
//         // Check if adding extra candies can make each child have the maximum or more candies
//         for (int i = 0; i < candies.length; i++) {
//             int ans = extraCandies + candies[i];
//             if (ans >= max) {
//                 a = true;
//                 newarr[i] = a;
//             }
//         }
        
//         // Convert boolean array to List<Boolean>
//         List<Boolean> resultList = new ArrayList<>();
//         for (boolean bool : newarr) {
//             resultList.add(bool);
//         }
        
//         return resultList;
//     }
// }