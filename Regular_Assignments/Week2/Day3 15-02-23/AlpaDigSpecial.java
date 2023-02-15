import java.util.*;
class AlpaDigSpecial{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character");
    ch=sc.next().charAt(0); 
    if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
      System.out.println("yes!The Character is alphabet");
    }
    else if((ch>='0' && ch<='9')){
      System.out.println("Yes!the character is digit");
    }
    else{
      System.out.println("The character is special Character");
    }
  }
}