// Write a JAVA program to print Fibonacci series up to n terms
import java.util.Scanner;

public class FibonacciSeries {
   public static void main(String[] args) {
      int n, n1 = 0, n2 = 1;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of n: ");
      n = sc.nextInt();
      System.out.print("Fibonacci Series up to " + n + " number: ");

      for (int i = 1; i <= n; ++i) {
         System.out.print(n1 + " ");
         int sum = n1 + n2;
         n1 = n2;
         n2 = sum;
      }
   }
}