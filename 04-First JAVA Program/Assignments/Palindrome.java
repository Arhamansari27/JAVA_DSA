    import java.util.Scanner;

    public class Palindrome {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your String : ");
            String palindrome = input.next();
            StringBuilder strBuilder = new StringBuilder(palindrome);
            String reversedPalindrome = strBuilder.reverse().toString();
            if (reversedPalindrome.equals(palindrome)) {
                System.out.println(reversedPalindrome);
            }
            else{
                System.out.println("Your number is not Palindrome");
            }
        }
    }
