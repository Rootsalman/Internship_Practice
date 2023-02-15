import java.util.*;
class EvenOdd{
  public static void main(String args[]){
    int Num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    Num=sc.nextInt();
    if(Num%2==0){
      System.out.println("yes!The Number is Even");
    }
    else{
      System.out.println("Yes!The Number is Odd");
    }
   
  }
}