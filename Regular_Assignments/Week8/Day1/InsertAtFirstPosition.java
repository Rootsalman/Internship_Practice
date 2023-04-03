// Write a Java program to insert an element into the array list at the first position
import java.util.ArrayList;

public class InsertAtFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
       
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add(0, "cherry");
        
      
        System.out.println("Elements of the ArrayList after inserting at first position:");
        for(String fruit: list) {
            System.out.println(fruit);
        }
    }
}