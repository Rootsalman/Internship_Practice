// Write a program that takes a list of integers as input and returns the largest integer in the list.
import java.util.*;
class LargestInteger{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> l1 = new ArrayList<>();
    System.out.println("enter the numbers u want to enter");
    l1.add(sc.nextInt());
    l1.add(sc.nextInt());
    l1.add(sc.nextInt());
    l1.add(sc.nextInt());
    l1.add(sc.nextInt());
    System.out.println(l1);
  }
}