//without return
import java.util.Scanner;
class MaxOf2Numbers{
  static void MaxNum(int num1,int num2){
    if(num1>num2){
      System.out.println("num1 is big");
    }
    else {
      System.out.println("num2 is big");
    }
  }
  public static void main(String args[]){
      MaxOf2Numbers.MaxNum(23, 25);
    }
}