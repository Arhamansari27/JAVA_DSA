    import java.util.*;

    public class Investment {

        // FV=PV×(1+r)^n

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the value of PV : ");
            float pv = in.nextFloat();
            System.out.print("Enter the value of r : ");
            float r = in.nextFloat() / 100;
            System.out.print("Enter the value of n : ");
            float n = in.nextFloat();
            double fv = pv * Math.pow((1 + r), n);
            System.out.println("Your Future Investment Product is " + fv);
        }
    }