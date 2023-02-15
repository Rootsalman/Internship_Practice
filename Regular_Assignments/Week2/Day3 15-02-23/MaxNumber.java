import java.util.*;
class MaxNumber{
  public static void main(String args[]){
    int Firstnumber,Secondnumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Firstnumber");
    Firstnumber=sc.nextInt();
    System.out.println("Enter the Secondnumber");
    Secondnumber=sc.nextInt();
    if(Firstnumber>Secondnumber){
      System.out.println("First number is greater");
    }
    else
      System.out.println("Second number is greater");
   
  }
}