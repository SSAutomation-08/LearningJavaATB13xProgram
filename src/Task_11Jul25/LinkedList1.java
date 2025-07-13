package Task_11Jul25;

import java.util.LinkedList;
import java.util.List;
public class LinkedList1 {
    public static void main(String[] args) {
        List <String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Mango");
        linkedList.add("Banana");
        System.out.println("Original List " + linkedList);
        linkedList.add(1,"Orange");
        System.out.println("New List " + linkedList);
    }
}
