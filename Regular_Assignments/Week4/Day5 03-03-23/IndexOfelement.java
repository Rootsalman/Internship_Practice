import java.util.*;
public class IndexOfelement{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the array elements ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
       System.out.println("Enter the number");
          int num = sc.nextInt();
      for(int i=0; i< size; i++){
        if(arr[i]==num)
        System.out.println(i);
      }
    
  }
}