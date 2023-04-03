// Write a Java program to copy one array list into another
import java.util.ArrayList;

public class ArrayListCopy {
    public static void main(String[] args) {
        
        ArrayList<Integer> originalList = new ArrayList<Integer>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

       
        ArrayList<Integer> copiedList = new ArrayList<Integer>();

       
        for (int i = 0; i < originalList.size(); i++) {
            copiedList.add(originalList.get(i));
        }

        System.out.println("Original ArrayList: " + originalList);
        System.out.println("Copied ArrayList: " + copiedList);
    }
}

