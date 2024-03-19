import java.util.*;
public class Batting {
    public static void main(String[] args) {
        // Batting Average = Hits (H) / At-bats (AB)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Hits: ");
        float hits = in.nextInt();
        System.out.print("Enter your At-Bats : ");
        float atbats = in.nextInt();
        float average = hits / atbats;
        System.out.println("Your batting average is " + average);
    }
}
