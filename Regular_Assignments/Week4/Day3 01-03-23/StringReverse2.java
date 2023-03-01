import java.util.*;
class StringReverse2{
  static void reversestr2(String str){
    String rev ="";
    for(int i=str.length()-1;i>=0;i--){
  rev = rev+str.charAt(i);
  }
    System.out.println(rev);
}

public static void main(String args[]){
  reversestr2("messi ronaldo");
}
}