import java.util.*;
public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int newage = input.nextInt();
        voting(newage);
    }
    static int voting(int age){
        int eligible = age;
        if (eligible >= 18) {
            System.out.println("You are elligible for vote.You are 18 years old.");
        }
        else{
             System.out.println("You are not elligible for vote.You are under 18.");
        }
        return eligible;
    }
}
