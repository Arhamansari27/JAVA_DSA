import java.util.*;

public class Two_dArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int row = sc.nextInt();
         int col = sc.nextInt();

         int [][] twod = new int [row][col];

         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                twod[i][j] = sc.nextInt();
            }
         }

         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(twod[i][j] + " ");
            }
            System.out.println();
         }
    }
}