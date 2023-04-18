import java.util.*;
public class Cards{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your type and number");
    char t1 = sc.next().charAt(0);
    int n1 = sc.nextInt();
    char t2 = sc.next().charAt(0);
    int n2 = sc.nextInt();
    char t3 = sc.next().charAt(0);
    int n3 = sc.nextInt();

    if(t1 == t2 && t2 == t3 && n1==n2 && n2 == n3){
      System.out.println("Player u got double bonaza");
    }else if(t1 == t2 && t2 == t3 || n1==n2 && n2 == n3){
      System.out.println("Player u got only bonaza");
    }else{
      System.out.println("Sry!! No bonaza");
    }
    
  }
}