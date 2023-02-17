import java.util.Scanner;
class OnlineShopNested{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to Amazon":");
    double Funds=2000;
    System.out.println("Enter item:");
    String Item=sc.next();
    int amt;
    if(Item.equals("Shoes")){
      System.out.println("Enter the quantity:");
      int q=sc.nextInt();
      amt=q*20;
      System.out.println("Amount"+amt);
      if(amt<=Funds){
        System.out.println("Purchased "+Item);
        Funds=Funds-amt;
        System.out.println("Balance:"+Funds);
      }
      else
      System.out.println("Add more money to your account!!Insufficient Funds");
    }
    else
      System.out.println("Out of Stock!Try again later");
  }
}