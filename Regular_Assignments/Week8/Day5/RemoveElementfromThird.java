// Write a Java program to remove the third element from a array list
import java.util.ArrayList;

public class RemoveElementfromThird {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
       
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("kiwi");
        
      
        list.remove(2);
      
        System.out.println("Elements of the ArrayList after removing the third element:");
        for(String fruit: list) {
            System.out.println(fruit);
        }
    }
}