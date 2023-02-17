import java.util.Scanner;
class Calculator1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num1,num2,Sum;
    int Operator;
    System.out.println("Enter the num1 value");
    num1 = sc.nextInt();
    System.out.println("Enter the num1 value");
    num2 = sc.nextInt();
    System.out.println("Choose the operator");
    System.out.println("Enter 1 for Addition");
    System.out.println("Enter 2 for Substraction");
    System.out.println("Enter 3 for Multiplication");
    System.out.println("Enter 4 for Division");
     System.out.println("Enter 5 for Modulas");
    
    Operator = sc.nextInt();
    if(Operator == 1){
      Sum = num1+num2;
      
    }
    else if(Operator == 2){
      Sum = num1 - num2;
     
    }
    else if(Operator == 3){
      Sum = num1 * num2;
      
    }
    else if(Operator == 4){
      Sum = num1/num2;
      
    }
    else if(Operator ==5){
      Sum = num1%num2;
      
    }
    else{
      System.out.println("Invalid input");
    }
    {
      System.out.println(Sum);
    }
    
    
  }
}