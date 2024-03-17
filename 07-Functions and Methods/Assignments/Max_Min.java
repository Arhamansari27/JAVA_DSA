import java.util.*;
public class Max_Min{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int fst = input.nextInt();
        System.out.print("Enter the 2nd number : ");
        int scnd = input.nextInt();
        System.out.print("Enter the 3rd number : ");
        int trd = input.nextInt();

        int ans = max_min(fst , scnd , trd);
        System.out.println(ans);
    }
    static int max_min(int first , int second , int third){
        int max = first;
        if (second > max) {
            max = second;
        }
         if (third > max) {
            max = third;
        }
        return max;
    }
}