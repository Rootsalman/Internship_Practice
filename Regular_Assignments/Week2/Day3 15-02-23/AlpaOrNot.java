import java.util.*;
class AlpaOrNot{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character");
   ch=sc.next().charAt(0); 
    if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
      System.out.println("yes!The Character is alphabet");
    }
    else{
      System.out.println("No!The character is not a alphabet");
    }
   
  }
}