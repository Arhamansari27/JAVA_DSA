import java.util.*;

public class Volume_of_cone_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // V =1/3 hπr²
        
        int r = input.nextInt();
        int h = input.nextInt();
        float pi = 3.14f;

    
        int power = (int) Math.pow(r, 2);

        System.out.println("Volume Of Cone is " + (pi * h * power) / 3);
    }
}
