public class Q11 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        int number = sentence.length();
        boolean a = false;
        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);
            if (number >= 26) {
                if (character >= 'a' && character <= 'z') {
                    a = true;
                }
            }
        }
        System.out.println(a);
    }
}


// LeetCode Solution

// class Solution {
//     public boolean checkIfPangram(String sentence) {
//         char ch = 'a';
//         for (int i = 0; i < 26; i++){
//             if(sentence.contains(String.valueOf(ch))){
//                 ch++;
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
//     }
// }
