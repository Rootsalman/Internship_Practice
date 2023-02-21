import java.util.*;
class WdivisibleBy5{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int sum=0,n,i;
    System.out.println("enter the number");
    n = sc.nextInt();
    i =1;
    while(i<=n){
      if(i%5==0){
        sum = sum +i;
        System.out.println(i);
      }
      i++;
    }
    System.out.println("sum :" +sum);
  }
}