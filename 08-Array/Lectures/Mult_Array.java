import java.util.*;

public class Mult_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize the array

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Add Elements

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // Printing
         
        System.out.println(list);
    }
}