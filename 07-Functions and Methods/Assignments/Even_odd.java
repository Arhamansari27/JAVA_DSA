import java.util.*;
public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input_number = input.nextInt();
        even_odd(input_number);
    }   
    static int even_odd(int number){
        int checknumber = number;
        if(checknumber % 2 == 0){
            System.out.println(checknumber + " is even number.");
        }
        else{
            System.out.println(checknumber + " is odd number.");
        }
        return checknumber;
    }
}
