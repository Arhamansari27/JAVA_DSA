import java.util.*;

public class Comission {
    public static void main(String[] args) {
        // Comission Percentage = (Comission Earned / Total Sales Amount ) * 100 ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the comission earned : ");
        float comission = in.nextInt();
        System.out.print("Enter the Total sales amount : ");
        float totalamount = in.nextInt();
       double finalans = (comission / totalamount) * 100;
       System.out.println("The comission is " + finalans + "%");
    }
}
