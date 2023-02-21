import java.util.*;
class SumOfOdd{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,sum=0,i;
    System.out.println("Enter the n value");
    n = sc.nextInt();
    for(i=1;i<=n;i=i+2){
      sum = sum+i;
    }
    System.out.println("The sum of given Odd numbers are :" +sum);
  }
}