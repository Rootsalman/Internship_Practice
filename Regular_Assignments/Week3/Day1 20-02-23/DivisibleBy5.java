import java.util.Scanner;
class DivisibleBy5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num=0;
    System.out.println("Numbers divisible by 5 are :");
    while (num <= 100) {
      if (num % 5 == 0)
        System.out.println(num);
      num = num + 1;
    }
      System.out.println("exit");
  }
}
