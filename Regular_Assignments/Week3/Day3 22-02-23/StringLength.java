import java.util.*;
class AgePositive{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    boolean valid=true;
    do{
      System.out.println("enter the string");
    String Name = sc.next();
      if(Name.length()<5){
          System.out.println("valid string");
        valid = false;
      }
      else {
        System.out.println("Invalid re enter the string");
      }
    }
      while(valid);
  }
}