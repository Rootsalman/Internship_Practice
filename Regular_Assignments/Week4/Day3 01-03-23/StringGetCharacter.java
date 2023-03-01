import java.util.*;
class StringGetCharacter{
  static void getCharacter(String str){
    System.out.println(str.charAt(4));
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your string");
    String str = sc.nextLine();
    getCharacter(str);
  }
}