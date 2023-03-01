import java.util.*;
public class StringPrinta1b2c3{
  public static void PrintCorrect(String str){
    char ch[] = str.toCharArray();
    String alpha="",digit="";
    for(int i=0;i<ch.length;i++){
      if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z'){
        alpha=alpha+ch[i];
      }
      else if(ch[i]>='0' && ch[i]<='9'){
        digit=digit+ch[i];
      }
    }
   String result=alpha+digit;
    System.out.println("string aftre seperation");
    System.out.println(result);
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your string");
    String str = sc.nextLine();
    PrintCorrect(str);
  }
}