// Write a Java program to iterate through all elements in a array list
import java.util.ArrayList;

public class IterateElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
       
        System.out.println("Elements of the ArrayList:");
        for(String fruit: list) {
            System.out.println(fruit);
        }
    }
}