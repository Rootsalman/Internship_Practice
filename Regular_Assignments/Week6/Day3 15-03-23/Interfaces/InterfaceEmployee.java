// Create an interface Employee with the following methods:public void calculateSalary();
// public void displayEmployeeDetails();
// Create classes Manager, Developer, and Tester that implement this interface. Write a program that accepts the type of employee and their details (name, age, designation, salary) and calculates their salary based on their designation. Display the employee details and the calculated salary.
import java.util*;
class interface Employee{
  void calculateSalary();
  void displayEmployeeDetails();
}
public class Manager implements employee{
  private String Emp_name;
  private Int Emp_age;
  private String Emp_Designation;
  private double Emp_salary;

  public Manager (String Emp_name,Int Emp_age,String Emp_Designation,double Emp_salary){
    this.Emp_name = Emp_name;
    this.Emp_age = Emp_age;
    this.Emp_Designation = "manager";
    this.Emp_salary = Emp_salary;
  }
  public void calculateSalary(){
    this.Salary = this.Salary +(this.Salary *0.2);
  }
  public void displayEmployeeDetails(){
    System.out.println("Employee name is :"+Emp_name)
  }
}