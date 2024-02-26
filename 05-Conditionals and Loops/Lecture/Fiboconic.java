import java.util.*;;
public class Fiboconic {
    public static void main(String[] args) {
        
        // Fiboconic number is basically the sum of previous two number

        // 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 ... 
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("Enter the nth number : ");
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);              
        }
    }
}
