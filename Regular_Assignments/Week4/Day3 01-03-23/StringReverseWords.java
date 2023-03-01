import java.util.*;
public class StringReverseWords {  
public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String rev="";  
  for(int i=0;i<words.length;i++){
       char a[]=words[i].toCharArray();
      rev="";
      for(int j=a.length-1;j>=0;j--){
        rev=rev+a[j];
      }
      System.out.print(rev+" ");
    }
  }

  //static String[] reversestring(String str){
    

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your string");
    String str=sc.nextLine();
    reverseWord(str);
}
}
