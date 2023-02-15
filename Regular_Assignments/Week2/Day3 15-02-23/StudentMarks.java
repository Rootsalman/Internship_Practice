import java.util.*;
class StudentMarks{
  public static void main(String args[]){
    double Physics,Chemistry,Biology,Mathematics,Computer,MaxMarks,Per,GainMarks;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Physics Marks");
    Physics = sc.nextDouble();
    System.out.println("Enter the Chemistry Marks");
    Chemistry = sc.nextDouble();
    System.out.println("Enter the Biology Marks");
    Biology = sc.nextDouble();
    System.out.println("Enter the Mathematics Marks");
    Mathematics = sc.nextDouble();
    System.out.println("Enter the Computer Marks");
    Computer = sc.nextDouble();
    System.out.println("Enter the Maximum marks");
    MaxMarks = sc.nextDouble();
    Per = ((Physics+Chemistry+Biology+Mathematics+Computer)/500)*100;
    System.out.println("Obtained percentage is :"+Per);
    if(Per>=90){
      System.out.println("A grade");
    }
    else if(Per<90 && Per>=80){
      System.out.println("B grade");
    }
     else if(Per<80 && Per>=70){
      System.out.println("C grade");
    }
     else if(Per<70 && Per>=60){
      System.out.println("D grade");
     }
    else if(Per<60 && Per>=40){
      System.out.println("E grade");
    }
    else{
      System.out.println("Fail");
    }
}
}
    
    