import java.util.Scanner;
class WnaturalNo{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,i=1;
    System.out.println("Enter the Number");
    n = sc.nextInt();
    System.out.println("the number of even numbers are :");
    //loop iteration
    while(i<=n){
      if(i%2==0){
        System.out.println(i);
      }
      i++;
    }
  }
}