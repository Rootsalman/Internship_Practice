import java.util.*;
class StringReverse{
  static void reverseStr(String str){
     char arr[] = str.toCharArray();
  String rev="";
  for(int i=arr.length-1;i>=0;i--){
  rev = rev+arr[i];
  }
    System.out.println(rev);
  }

public static void main(String args[]){
  reverseStr("Messi");
}
}
