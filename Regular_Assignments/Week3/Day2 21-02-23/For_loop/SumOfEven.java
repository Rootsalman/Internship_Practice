import java.util.*;
class SumOfEven{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,sum=0,i;
    System.out.println("Enter the n value");
    n = sc.nextInt();
    for(i=0;i<=n;i=i+2){
      sum = sum+i;
    }
    System.out.println("The sum of given even numbers are :" +sum);
  }
}