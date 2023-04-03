// Write a Java program to empty an array list.
import java.util.ArrayList;

public class EmptyArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Empty the ArrayList using clear method
        numbers.clear();

        // Print the empty ArrayList
        System.out.println("Empty ArrayList: " + numbers);
    }
}
