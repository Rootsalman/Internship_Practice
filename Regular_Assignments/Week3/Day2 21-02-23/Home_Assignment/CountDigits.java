import java.util.*;
class CountDigits{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int count=0;
    long num;
    System.out.println("Enter the Number");
    num = sc.nextLong();
   while(num>0){
      num = num/10;
       ++count;
    }
    System.out.println("The number of digits in a given number is :" +count);
  }
}