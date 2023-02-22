import java.util.Scanner;
class PrimeNumber{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i=2,count=0;
    System.out.println("Enter a number");
    int num = sc.nextInt();
    while(i<=num/2){
      if(num%i==0){
        count++;
        break;
      }
      i++;
    }
    if(count==0){
      System.out.println("PrimeNumber");
    }
    else{
      System.out.println("Not a PrimeNumber");
    }
  }
}
/*import java.util.*;
class LoopsDemo  {    
public static void main(String args[]){    
Scanner sc=new Scanner(System.in);      
System.out.println("Enter n value");     
int n=sc.nextInt();      
int count=0;      
for(int i=1;i<=n;i++){      
if(n%i==0){          
count++;        
}     
}     
if(count==2){       
System.out.println("Its prime number");   
}      
else    
{         
System.out.println("not a prime number");     
}   
} 
}*/