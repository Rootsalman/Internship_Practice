import java.util.*;
class NumbersNto1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("Enter the n value");
    n = sc.nextInt();
    System.out.println("The Numbers from N to 1");
    for(i=n;i>0;i--){
      System.out.println(i);
    }
  }
}