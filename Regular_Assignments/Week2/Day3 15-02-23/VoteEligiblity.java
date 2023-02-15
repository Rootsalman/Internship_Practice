import java.util.*;
class VoteEligiblity{
  public static void main(String args[]){
    int Age;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter persons age");
    Age=sc.nextInt();
    if(Age>=18){
      System.out.println("yes!The person is Eligible.");
    }
    else{
      System.out.println("Ohh No!The person is not Eligible.");
    }
   
  }
}