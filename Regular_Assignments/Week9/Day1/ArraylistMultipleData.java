import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistMultipleData {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        Scanner input = new Scanner(System.in);

        list.add("Hello");
        list.add(123);
        list.add(3.14159);
        list.add(true);

        System.out.println("Enter the element to search:");
        Object searchElement = input.nextLine();

        if (list.contains(searchElement)) {
            System.out.println("Element found in the list.");
        } else {
            System.out.println("Element not found in the list.");
        }
      System.out.println(list);
    }
}
