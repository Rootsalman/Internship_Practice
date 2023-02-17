import java.util.Scanner;
class TaxSalary{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double Mon_Salary,Total_Salary,Tax_Amount=0,Net_Salary;
    System.out.println("Enter the Mon_Salary");
    Mon_Salary = sc.nextDouble();
    Total_Salary = Mon_Salary*12;
    System.out.println("the to Total_Salary is :" +Total_Salary);
    if(Total_Salary<=300000){
      System.out.println("No GST will be added");
    }
    if(Total_Salary>=300000 && Total_Salary<=600000){
      Tax_Amount = Total_Salary*0.05;
      System.out.println("Tax after 5% gst :"+Tax_Amount);
    }
    else if(Total_Salary>=600000 && Total_Salary<=900000){
      Tax_Amount = Total_Salary*0.10;
      System.out.println("Tax after 10% gst :"+Tax_Amount);
    }
     else if(Total_Salary>=900000 && Total_Salary<=1200000){
      Tax_Amount = Total_Salary*0.15;
      System.out.println("Tax after 15% gst :"+Tax_Amount);
    }
     else if(Total_Salary>=1200000 && Total_Salary<=1500000){
      Tax_Amount = Total_Salary*0.20;
      System.out.println("Tax after 20% gst :"+Tax_Amount);
    }
     else if(Total_Salary>1500000){
      Tax_Amount = Total_Salary*0.30;
      System.out.println("Tax after 30% gst :"+Tax_Amount);
    }
    else{
      System.out.println("Invalid input");
    }
    {
      Net_Salary = Total_Salary-Tax_Amount;
      System.out.println("Your net salary is :" +Net_Salary);
    }
  }
}