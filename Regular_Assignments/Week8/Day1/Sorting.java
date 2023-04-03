// Write a Java program to sort a given array list
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);

        Collections.sort(numbers);

        System.out.println("Sorted ArrayList: " + numbers);
    }
}
