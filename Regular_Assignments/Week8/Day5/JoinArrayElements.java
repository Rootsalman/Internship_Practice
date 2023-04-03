// Write a Java program to join two array lists.

import java.util.ArrayList;
import java.util.List;

public class JoinArrayElements {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

      
        List<Integer> joinedList = new ArrayList<Integer>(list1);
        joinedList.addAll(list2);

        
        System.out.println("Joined ArrayList: " + joinedList);
    }
}
