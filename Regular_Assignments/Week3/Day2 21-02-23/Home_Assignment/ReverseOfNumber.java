import java.util.*;
class ReverseOfNumber{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number, reverse = 0;  
    System.out.println("Enter a number");
    number = sc.nextInt();
    while(number != 0) {
      int r = number % 10; 
      reverse = reverse * 10 + r;  
      number = number/10; 
    }  
    System.out.println("The reverse of the given number is: " + reverse);  
  } 
}  
  
