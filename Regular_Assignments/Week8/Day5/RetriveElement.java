// Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.ArrayList;

public class RetriveElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
      
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);
    }
}