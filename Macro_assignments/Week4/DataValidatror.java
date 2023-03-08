// Data validator: Create a menu based application that can display list of options:
 //--> Email Verifier: Create a method that takes an email address as input and verifies if it is in the correct format using regular expressions.
 //--> Username and password Verifier: Create a method that takes an username and password as input and  verifies these are following basic rules (having 1 uppercase, lowercase, 1 digit,1 special character etc....)
 //--> Mobile number Verifier: Create a method that  takes a mobile number as input and verifies it contains only digits or not, length should be 10   digits, starts with 6 or 7 or 8 or 9.
import java.util.*;
import java.util.regex.*;  
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class DataValidatror{
  public static void Emailverify(String email){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your email Address");
    email = sc.nextLine();
    String regex =  "^[A-Za-z0-9+_.-]+@(.+)$";
     Pattern pattern = Pattern.compile(regex); 
    Matcher matcher = pattern.matcher(email);  
    System.out.println(email +" : "+ matcher.matches()+"\n");
  }
   public static void Usernameverify(String username){
      Scanner sc = new Scanner(System.in);
    System.out.println("enter your Username");
    username = sc.nextLine();
      String regex1 = "[A-Za-z]";
     if (username.matches(regex1)) {
        System.out.println("Valid");
    } else {
        System.out.println("Invalid");
     }         
   }
  public static void Passwordverify(String password){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your password");
    password = sc.nextLine();
    String regex3 = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
      if (password.matches(regex3)) {
        System.out.println("Valid");
    } else {
        System.out.println("Invalid");
     }   
  }
   public static void Mobilenumberverify(String mobile){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your Mobile number");
    mobile = sc.nextLine();
    String regex4 = "^\\+([0-9\\-]?){9,11}[0-9]$";
      if (mobile.matches(regex4)) {
        System.out.println("Valid");
    } else {
        System.out.println("Invalid");
     }   
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int ch;
    int choice;
    char c='y';
    String email="";
    String username="";
    String password="";
    String mobile="";
    do{
    System.out.println("Enter your choice");
    System.out.println("**************");
    System.out.println("1 For Email Verifier\n2 For Username Verifier\n3 For Pasword verifier\n4 For Mobile number Verifier");
    System.out.println("enter");
    choice = sc.nextInt();
 switch(choice){
   case 1:
     Emailverify(email);
   case 2:
     Usernameverify(username);
   case 3:
     Passwordverify(password);
   case 4:
     Mobilenumberverify(mobile);
 }
 System.out.println("Do you want to continue :");
    c = sc.next().charAt(0);
    }while(c!='n');
  }
}