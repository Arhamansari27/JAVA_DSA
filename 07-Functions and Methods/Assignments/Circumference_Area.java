import java.util.*;
public class Circumference_Area {
    public static void main(String[] args) {

        // c = 2πr and A = πr² .

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int realradius = input.nextInt();
        circumference(realradius);
        area(realradius);
    }
    static int circumference(int radius){
        int two = 2;
        float pi = 3.141f;
        int r = radius;
        int ans = (int)(two * pi * r);
        System.out.println(ans);
        return ans;
    }
    static int area (int rad){
        float pii = 3.141f;
        int radi = rad;
        int ans = (int)(pii*(radi * radi));
        System.out.println(ans);
        return ans;
    }
}
