import java.util.*;

public class Depreciation {
    public static void main(String[] args) {

        // Initial value (cost) of the asset
        // Salvage value (residual value) of the asset at the end of its useful life
        // Useful life of the asset
        // Depreciation method (straight-line, declining balance, etc.)

        // Formula :

        // Depreciation Expense = (Initial Value - Salvage Value) / Useful Life
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your initial value : ");
        float initial = in.nextInt();
        System.out.print("Enter your Salvage value : ");
        float salvage = in.nextInt();
        System.out.print("Enter your useful life : ");
        float useful = in.nextInt();
        float depreciation = (initial - salvage) / useful;
        System.out.println("Your Depreciation value is " + depreciation);
    }
}