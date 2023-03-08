import java.util.*;
class StringReplacer{
  public static void Replaceer(String str,String word,String rep){
    System.out.println(str.replace(word,rep));
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str =("helo guys welcome to bitlabs");
    System.out.println("enter the word u want to replace");
    String word = sc.nextLine();
    String rep = sc.nextLine();
    Replaceer(str,word,rep);
  }
}