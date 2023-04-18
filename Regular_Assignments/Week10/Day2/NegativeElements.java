import java.util.Scanner;

public class NegativeElements{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int length = input.nextInt();
    int[] a = new int[length];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < length; i++){
      a[i] = sc.nextInt();
        }
    System.out.println("Negative elements in the array are:");
        for (int i = 0; i < length; i++) {
            if (a[i] < 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
