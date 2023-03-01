import java.util.*;
class StringCompareMethod{
  static void compareString(String str1, String str2){
    if(str1.equals(str2)){
      System.out.println("string are equal");
    }
    else{
      System.out.println("String are not equal");
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first string");
    String str1 = sc.nextLine();
    System.out.println("Enter your second string");
    String str2 = sc.nextLine();
    compareString(str1,str2);
    
  }
}