import java.util.Scanner;
class SumOfIntegers{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num,Digit,Sum=0;
    System.out.println("Enter the number");
    num = sc.nextInt();
    while (num > 0){
      Digit = num%10;
      Sum = Sum + Digit;
      num = num/10;
    }
    System.out.println("The sum of Digits is :" +Sum);
  }
}