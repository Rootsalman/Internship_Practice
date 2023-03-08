 // Create a class called "BankAccount" with attributes like "balance" and "account_number". Include methods that deposit and withdraw money from the account, as well as a method that displays the account balance.
import java.util.*;
class BankAccount{
  long Acc_number=123456789;
  int balance = 20000;
  int deposit,withdraw;
  int updatebalance;

  void read(){
    Scanner sc = new Scanner(System.in);
    System.out.println("WELCOME TO BANK OF PUNJAB");
  }
  void Deposit(){
    long AC_number=0;
    Scanner sc = new Scanner(System.in);
     System.out.println("For DEPOSIT");
    System.out.println("Enter your Account number");
    AC_number = sc.nextLong();
    if(AC_number==Acc_number){
      System.out.println("Enter the amount you need to deposit");
      deposit = sc.nextInt();
      updatebalance = balance + deposit;
       System.out.println("the balance amount is" + updatebalance);
    }
    else{
      System.out.println("Invalid input");
    }
  }
  void withdraw(){
    long AC_number=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("For WITHDRAW");
     System.out.println("Enter your Account number");
    AC_number = sc.nextLong();
    if(AC_number==Acc_number){
      System.out.println("Enter the amount you need to withdraw");
      withdraw = sc.nextInt();
      balance = updatebalance-withdraw;
      System.out.println("the balance amount is" +balance);
    }
     else{
      System.out.println("Invalid input");
    }
  }
}

  public class ObjectClassAtm{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      BankAccount str = new BankAccount();
      str.read();
      str.Deposit();
      str.withdraw();
    }
  }
