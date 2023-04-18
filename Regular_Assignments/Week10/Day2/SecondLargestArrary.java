import java.util.Scanner;
public class SecondLargestArrary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
          a[i] = scanner.nextInt();
        }
        int largest = a[0];
        int secondLargest = a[0];
        for (int i = 0; i < size; i++){
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest){
              secondLargest = a[i];
            }
        }
      System.out.println("The second largest element in the array is: " + secondLargest);
    }
}
