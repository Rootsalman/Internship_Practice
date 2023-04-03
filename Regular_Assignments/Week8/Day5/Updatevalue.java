// Write a Java program to update specific array element by given element
import java.util.ArrayList;

public class Updatevalue {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        
        list.set(1, "grape");
        
        
        System.out.println("Elements of the ArrayList after updating:");
        for(String fruit: list) {
            System.out.println(fruit);
        }
    }
}