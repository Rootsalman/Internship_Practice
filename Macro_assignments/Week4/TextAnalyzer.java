//Text Analyzer: Create an application that takes a text as input and performs different analysis like counting the number of characters, words, and lines, or finding the most common words.
import java.util.*;
class TextAnalyzer{
  public static void textanalyze(String str){
  char c[] = str.toCharArray();
    int count = 0;
    for(int i=0;i<c.length;i++){
      count++;
    }
    System.out.println("the count of characters are:");
        System.out.println(count);
  }

 public static void countword(String str1){
  String c1[] = str1.split(" ");
    int count = 0;
    for(int i=0;i<c1.length;i++){
      count++;
    }
    System.out.println("the count of words are:");
        System.out.println(count);
  }

  public static void countLine(String str2){
   String [] lines = str2.split("\r\n|\r|\n");
    System.out.println("the count of lines are:");
        System.out.println(lines.length);
  }
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  String str ="heloo welcome guys";
  String str1="heloo guys and goos";
  String str2="line1\nline2\nline3\n";
    textanalyze(str);
  countword(str1);
  countLine(str2);
}
}