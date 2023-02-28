//with para with return
import java.util.Scanner;
class MaxOf2Numbers2{
  static int MaxNum(int num1,int num2){
    if(num1>num2){
      return num1;
    }
    else {
     return num2;
    }
  }
  public static void main(String args[]){
      int max =MaxOf2Numbers.MaxNum(23, 25);
    System.out.println(max);
    }
}