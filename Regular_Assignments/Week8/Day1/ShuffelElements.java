// Write a Java program to shuffle elements in a array list
import java.util.ArrayList;
import java.util.Collections;

public class ShuffelElements {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        
        Collections.shuffle(numbers);

        System.out.println("Shuffled ArrayList: " + numbers);
    }
}
