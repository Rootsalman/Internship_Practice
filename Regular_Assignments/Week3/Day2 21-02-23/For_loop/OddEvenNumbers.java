import java.util.*;
class OddEvenNumbers{    
  public static void main(String args[]){      
    int n;      
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");      
    n=sc.nextInt();     
    System.out.println("Odd Numbers are");
    for(int i=1;i<=n;i++){  
      if(i%2!=0){
        System.out.println(i);  
      } 
    } 
    System.out.println("Even Numbers are");
    for(int i=1;i<=n;i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
  } 
}