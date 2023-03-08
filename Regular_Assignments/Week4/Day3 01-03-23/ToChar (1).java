import java.util.*;
class ToChar{
  public static void tocharr(String str){
    char arr[] = str.toCharArray();
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String args[]){
    tocharr("hello ther");
  }
}