import java.util.*;
class DivisilbeBy5{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("Enter the n value");
    n = sc.nextInt();
    for(i=0;i<=n;i++){
      if(i%5==0){
        System.out.println(i);
      }
    }
  }
}