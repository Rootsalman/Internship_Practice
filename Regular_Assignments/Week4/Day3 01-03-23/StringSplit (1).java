import java.util.*;
class StringSplit{
  public static void split(String s1){
    String word[] = s1.split(" ");
    System.out.println(word.length);
    for(int i=0;i<word.length;i++)
      System.out.println(word[i]);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    split(s1);
  }
}