import java.util.Scanner;
class StringUpperCase{
  static void UpperCase(String str1){
    System.out.println(str1.toUpperCase());
  }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // int count=0;
    System.out.println("Enter your first string");
    String str1 = sc.nextLine();
    // System.out.println("Enter your second string");
    // String SubString = sc.nextLine();
    UpperCase(str1);
    
  }
}
