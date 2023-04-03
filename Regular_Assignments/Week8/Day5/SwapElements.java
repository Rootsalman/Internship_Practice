// Write a Java program of swap two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Swap two elements in the ArrayList
        Collections.swap(numbers, 1, 3);

        // Print the ArrayList after swapping
        System.out.println("ArrayList after swapping: " + numbers);
    }
}

