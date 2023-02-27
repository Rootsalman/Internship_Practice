import java.util.*;
import java.util.Random;
class MacroRandomNum{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Random random = new Random();  
    System.out.println("enter a number");
      int guess = sc.nextInt();
    int randomNumber =random.nextInt(100);
    System.out.println(randomNumber);
    while(true){
      if(guess!=randomNumber){
        System.out.println("Oh OOh not correct Re-enter the random number");
      guess = sc.nextInt();
        System.out.println("Random number is :" +randomNumber);
    }
      else{
        System.out.println("guess is correct");
        break;
      }
      }
    
  }
}