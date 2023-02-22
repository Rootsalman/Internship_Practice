import java.util.*;
class AgePositive{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    boolean valid=true;
    do{
      System.out.println("enter the age");
    int age = sc.nextInt();
      if(age >=0){
          System.out.println("valid age");
        valid = false;
      }
      else {
        System.out.println("Invalid re enter the age");
      }
    }
      while(valid);
  }
}