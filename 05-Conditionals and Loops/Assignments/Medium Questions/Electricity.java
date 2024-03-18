import java.util.*;

public class Electricity {
    public static void main(String[] args) {

        // The formula to calculate electricity bill varies depending on the pricing
        // structure of the utility company. However, a common formula for calculating
        // electricity cost is:

        // Electricity Cost = Power Consumed (in kWh) × Cost per kWh

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the power consumed in kwh : ");
        int kwh = input.nextInt();
        System.out.print("Enter the cost consumed per kwh : ");
        int cost = input.nextInt();
        System.out.println(kwh * cost + "$");
    }
}
