import java.util.*;
class Format{
  public static void main(String args[]){
  float a1 = 12.34f,b2 = 11.66f;
  float result = a1*b2;
 String result1=String.format("%||-10.3f||%-10.3f||",result,result);
    System.out.println(result1);  
    String result2=String.format("%||-10.3f||%-10.3f||",result,result);
      System.out.println(result2);
}
}