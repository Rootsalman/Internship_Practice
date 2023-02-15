import java.util.*;
class UpperLower{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character");
    ch=sc.next().charAt(0); 
    if(ch>='A' && ch<='Z'){
      System.out.println("yes!The Character is in upper case");
    }
    else{
      System.out.println("yes! The character is Lower case");
    }
}
}