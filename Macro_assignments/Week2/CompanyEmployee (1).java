import java.util.Scanner;
class CompanyEmployee{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double Salary,Total_salary;
    int Ratings;
    System.out.println("enter the salary");
      Salary = sc.nextDouble();
    System.out.println("Select Employee rating:");
    System.out.println("FOR EXCELLENT Press 1");
    System.out.println("FOR GOOD press 2");
    System.out.println("FOR AVERAGE press 3");
    System.out.println("FOR POOR press 4");
      Ratings = sc.nextInt();
    if(Ratings == 1){
      System.out.println("Add 10% of bonus");
      Total_salary = 0.10*Salary;
      System.out.println("The total salary is :" +Total_salary);
    }
    else if(Ratings == 2){
      System.out.println("Add 5% of bonus");
      Total_salary = 0.50*Salary;
      System.out.println("The total salary is :" +Total_salary);
    }
    else if(Ratings == 3){
      System.out.println("Add 2% of bonus");
      Total_salary = 0.20*Salary;
      System.out.println("The total salary is :" +Total_salary);
    }
    else if (Ratings == 4){
      System.out.println("No bonus");
    }
    else {
      System.out.println("Invalid input");
    }
  }
}