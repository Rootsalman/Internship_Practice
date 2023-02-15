import java.util.*;
class PosNegZero{
  public static void main(String args[]){
    int Number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    Number=sc.nextInt();
    if(Number>0){
      System.out.println("The number is positive");
    }
    else if(Number<0){
      System.out.println("The number is negative");
    }
    else{
      System.out.println("The number is Zero");
    }
  }
}