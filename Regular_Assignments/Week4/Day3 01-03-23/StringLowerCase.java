import java.util.Scanner;
class StringLowerCase{
  static void LowerCase(String str1){
    System.out.println(str1.toLowerCase());
  }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // int count=0;
    System.out.println("Enter your first string");
    String str1 = sc.nextLine();
    // System.out.println("Enter your second string");
    // String SubString = sc.nextLine();
    LowerCase(str1);
    
  }
}
