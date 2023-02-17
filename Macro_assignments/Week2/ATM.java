import java.util.*;
class ATM{
   public static void main(String args[]){
    Scanner sc =new Scanner (System.in);    
    double balance=1000;    
    String pin = "1234";
    String newPin;
    int choice,withdraw,Deposit;    
    System.out.println("welcome to the bank of baroda");   
      System.out.println("Press 1 to check balance");
      System.out.println("Press 2 to withdraw money");
     System.out.println("Press 3 to Deposit money");
     System.out.println("Press 4 to Change pin");
     System.out.println("Press 5 to Exit");
    System.out.println("Enter the choice(1-5)");
     choice=sc.nextInt();
    
    switch(choice){
    case 1:
     System.out.println("The balance is"+balance);
     break;
    case 2:
      System.out.println("Enter the pin");
        pin = sc.next();
     if(pin.equals("1234")&&balance>=1000){
       System.out.println("Enter the amount to withraw");
       withdraw=sc.nextInt();
       balance=balance-withdraw;
       System.out.println("Amount Withdraw SuccessfUlly:");
        System.out.println("Your current balance is:" +balance);
     
     }
    else if(pin.equals("1234")&&balance<1000){
      System.out.println("Insufficient Balance");
    }
    else{
      System.out.println("Enter the correct pin");
    }
    break;
    case 3:
       if(pin.equals("1234")){
       System.out.println("Enter the amount to be deposited");
       Deposit=sc.nextInt();
         balance=balance+Deposit;
       System.out.println("Aomunt deposit Successfylly");
         System.out.println("Current balance is" +balance);
     }
    else{
      System.out.println("Enter the correct pin");
    }
    break;
    case 4:
      if(pin.equals("1234")){
      System.out.println("Enter your new pin: ");
      newPin = sc.next();
      System.out.println("Confirm your new pin: ");
      String Newpin2 = sc.next();
        if(newPin.equals("Newpin2")){
          pin=newPin;
        }
      System.out.println("Your pin as been succesfully changed : ");
      }
    else{
      System.out.println("Your pin is incorrect: ");
    }
    break;
    case 5:
      System.out.println("Thank you for Banking with us ");
    break;
    default:
      System.out.println("Invalid: ");
      }  
}    
}