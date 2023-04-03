// Write a Java program to search an element in a array list.
import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int index = numbers.indexOf(3);

        if (index != -1) {
            System.out.println("Number 3 found at index " + index);
        } else {
            System.out.println("Number 3 not found");
        }
    }
}

