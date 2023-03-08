import java.util.regex.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class RegexDemo{
  public static void RegexDem(String str){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr youe username");
    str = sc.nextLine();
    String regex = "^[A-Za-z]\\w{5,29}$";
    if(str.matches(regex)){
      System.out.println("its valid");
    }
    else{
      System.out.println("Invalid");
    }
  }
  public static void main(String args[]){
    String str = "";
    RegexDem(str);
  }
}