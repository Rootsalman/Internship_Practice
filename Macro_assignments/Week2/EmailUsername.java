import java.util.Scanner;
class EmailUsername{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String Email,Username;
    System.out.println("Enter your emial address");
    Email = sc.next();
    System.out.println("Enter your username");
    Username = sc.next();
    if(Email.equals("abc@gmail.com") && Username.equals("user")){
      System.out.println("Auntentication is valid");
    }
    else{
      System.out.println("Auntentication notvalid");
    }
  }
}