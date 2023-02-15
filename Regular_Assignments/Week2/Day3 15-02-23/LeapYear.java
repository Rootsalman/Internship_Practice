import java.util.*;
class LeapYear{
  public static void main(String args[]){
    int Year;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Year");
    Year=sc.nextInt();
    if(Year%4==0){
      System.out.println("yes!The Year is leap year");
    }
    else{
      System.out.println("No!The Year is not a leap year");
    }
   
  }
}