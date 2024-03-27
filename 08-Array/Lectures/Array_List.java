import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        
        // Add for add element
        // Set for update element
        // Remove for remove element

        list.add(12); 
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        
        System.out.print(list);

        list.set(0, 191);
        System.out.println();
        System.out.print(list);

        list.remove(0);
        System.out.println();
        System.out.println(list);
    }

}