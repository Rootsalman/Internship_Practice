import java.util.*;
class ArmStrongNumber{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int Res=0,Rem=0,Org=n;
     while(n!=0){        
       Rem=n%10;     
       Res=Res+(int)Math.pow(Rem,3);     
       n=n/10;     
     }     
    if(Org==Res){
      System.out.println("the number is Armstrong");
    }
    else{
      System.out.println("The number is not Armstrong");
    }
  }
}

/*import java.util.Scanner;
class Armstrongnumber {   
  public static void main(String[] args) {     
    int num, temp, remainder, result = 0, n = 0;    
    Scanner sc = new Scanner(System.in);     
    System.out.print("Enter a number: ");    
    num = sc.nextInt();     
    temp= num;     
    while (temp != 0) {      
      temp= temp/10;      
      n++;      
    }      
    temp = num;    
    while (temp != 0) {      
      remainder = temp % 10;     
      result= result + (int)Math.pow(remainder,n);  
      temp = temp/10;     
    }  
    if (result == num)    
      System.out.println(num + " is an Armstrong number.");     
    else        
      System.out.println(num + " is not an Armstrong number.");  
  }
}
*/