import java.util.Scanner;
class WsumOfEven{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int sum=0,n,i=1;
    System.out.println("Enter the number");
    n = sc.nextInt();
    while(i<=n){
      if(i%2==0){
        sum = sum +i;
      }
      i++;
    }
    System.out.println("the sum of even number is :" +sum);
  }
}