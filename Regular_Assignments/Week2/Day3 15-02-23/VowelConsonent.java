import java.util.*;
class VowelConsonent{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character");
   ch=sc.next().charAt(0); 
    if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch =='u'){
      System.out.println("yes!The Character is Vowel");
    }
    else{
      System.out.println("Yes!The character is Consonent");
    }
   
  }
}