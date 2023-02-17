import java.util.*;
class TemperatureConverter{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter temperature");
    double temp,C,F;
    temp = sc.nextDouble();
    System.out.println("convert to:");
    System.out.println("If convert to celcius:C");
    System.out.println("If convert to Fahrenheit:F");
    String convert = sc.next();
    if(convert.equals("F")){
       F = (temp* 9/5) + 32;
      System.out.println(F);
    }
    else if(convert.equals("C")){
      C = (temp - 32) * 5/9;
      System.out.println(C);
    }
  }
}