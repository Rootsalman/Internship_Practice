import java.util.Scanner;
import java.util.Random;
class MultipleService{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int Result=0,Option;
    double temp=0, F, C, Kilo=0,Miles=0;
      System.out.println("Select the option");
      System.out.println("Press 1 for calculator");
     System.out.println("Press 2 for Converter");
     System.out.println("Press 3 for Random Number Generator");
     System.out.println("Press 4 to Quit");
     Option = sc.nextInt();
     if(Option == 1){
        System.out.println("Enter the first number");
       int num1 = sc.nextInt();
        System.out.println("Enter the Second number");
       int num2 = sc.nextInt();
        System.out.println("Select the operation");
    System.out.println("A for Addition");
     System.out.println("B for Substraction");
     System.out.println("C for Multiplication");
     System.out.println("D for Division");
    char opr = sc.next().charAt(0);
     if(opr == 'A'){
       Result = num1+num2;
       System.out.println("Result is :"+Result);
    }
    else if(opr == 'B'){
        Result = num1-num2;
       System.out.println("Result is :"+Result);
    }
    else if(opr == 'C'){
       Result = num1*num2;
       System.out.println("Result is :"+Result);
    }
    else if(opr == 'D'){
       Result = num1/num2;
       System.out.println("Result is :"+Result);
    }
    else{
      System.out.println("Invalid input");
    }
     }
       else if(Option == 2){
          System.out.println("Select the operation");
    System.out.println("a for Celsius to Fahrenheit");
     System.out.println("b for Fahrenheit to Celsius");
     System.out.println("c for Kilometers to Miles");
     System.out.println("d for Miles to kilometers");
       }
       char Opr1 = sc.next().charAt(0);
       if(Opr1 == 'a'){
         System.out.println("Enter the temperature");
         temp = sc.nextDouble();
          F = (temp * 9/5) + 32;
      System.out.println("Temperature in Fahrenheit:" +F);
       }
        else if(Opr1 == 'b'){
         System.out.println("Enter the temperature");
          temp = sc.nextDouble();
         C = (temp - 32) * 5/9;
      System.out.println("Temperature in Celsius:" +C);
       }
        else if(Opr1 == 'c'){
         System.out.println("Enter the kilometers");
          Kilo = sc.nextDouble();
          Miles = Kilo*0.62137119;
      System.out.println("Number of miles is :" +Miles);
       }
       else if(Opr1 == 'd'){
         System.out.println("Enter the Miles");
         Miles = sc.nextDouble();
          Kilo = Miles*1.60934;
      System.out.println("Number of kilometers is:" +Kilo); 
       }
           else{
      System.out.println("Invalid input");
    }
        if(Option == 3){
      System.out.println("enter the Number");  
    }
    
  }
  }

