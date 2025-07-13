package Task_11Jul25;

public class ArrayList<I extends Number> {
    public static void main(String[] args) {
        java.util.ArrayList list = new java.util.ArrayList();

        // Add element
        list.add("Dipak");
        list.add("Ravi");
        list.add("Sneha");
        list.add("Priya");
        list.add("Anjali");
        System.out.println("Added List " + list);

        //Remove element
        list.remove("Ravi");
        System.out.println("Removed item list " +list);

        //Find an element
        if (list.contains("Ravi")) {
            System.out.println("Is available in list");
        }
         else{
            System.out.println("Not in the list");
        }
    }
}



