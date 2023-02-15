import java.util.*;
class EmployeeSalary{
  public static void main(String args[]){
    double BasicSalary,GrossSalary,HRA,DA;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Basic Salary");
    BasicSalary = sc.nextDouble();
    if(BasicSalary<=10000){
      HRA = BasicSalary*0.2;
      DA = BasicSalary*0.8;
      GrossSalary = BasicSalary+HRA+DA;
      System.out.println("The gross salary is :" +GrossSalary);
    }
    else if(BasicSalary<=20000 && BasicSalary>10000){
      HRA = BasicSalary*0.25;
      DA = BasicSalary*0.9;
      GrossSalary = BasicSalary+HRA+DA;
      System.out.println("The gross salary is :" +GrossSalary);
    }
     else{
      HRA = BasicSalary*0.3;
      DA = BasicSalary*0.95;
      GrossSalary = BasicSalary+HRA+DA;
      System.out.println("The gross salary is :" +GrossSalary);
    } 
  }
}