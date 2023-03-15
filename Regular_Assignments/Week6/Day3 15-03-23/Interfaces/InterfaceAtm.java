// interface ATM
//   withdraw()
//   deposit()
//   getBalance()
 
//   SBIATM
import java.util.*;
interface Atm{
  void withdraw();
  void deposit();
  void getBalance();
}
class SBIATM implements Atm{
  public void withdraw(){
  double Balance =20000;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount you want to withdraw");
    double Amount = sc.nextDouble();
     Balance = Balance - Amount;
    System.out.println("Updated balance is" +Balance);
  }

  public void deposit(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount you need to deposit");
    double Amount2 = sc.nextDouble();
     double Balance2 = Balance + Amount2;
    System.out.println("updated balance is " +Balance2);
  }
  public void getBalance(){
    System.out.println(Balance);
  }
}
class InterfaceAtm{
  public static void main(String args[]){
    Atm aa = new SBIATM();
    aa.withdraw();
    aa.deposit();
    aa.getBalance();
  }
}