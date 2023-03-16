// 1. Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.
class InsufficientFundsException extends Exception{
  InsufficientFundsException(String str){
    super(str);
    
  }
}
 
class BankAccount{
  int balance=50000;
  void Deposit(int DepositAmount) throws InsufficientFundsException{
      
    if(DepositAmount==0){
      throw new InsufficientFundsException("OHHH!!Deposit amount cannot be zero");
    } 
    else{
      int total_balance=balance+DepositAmount;
      System.out.println("Amount deposited sucssesfully"+total_balance);
    }
    }
  void Withdraw(int WithdrawAmount) throws InsufficientFundsException{
    int balance=50000;
     if(WithdrawAmount>balance){
      throw new InsufficientFundsException("Invalid Amount:Insufficient balance");  
    }
    else{
      int New_balance=balance-WithdrawAmount;
      System.out.println("*******Success**********");
      System.out.println("The reamaning balance is ---->:" +New_balance);
    }
  }
  }
 
class ExceptionBankAccount{
public static void main(String args[]){
BankAccount atm=new BankAccount();
 BankAccount atm2 = new BankAccount(); 
  try{
    atm.Deposit(10000);
  }
  catch(InsufficientFundsException e){
    System.out.println(e);
  }
  try{
    atm2.Withdraw(1000);
  }
  catch(InsufficientFundsException a){
    System.out.println(a);
  }
}
}
 
 
 
