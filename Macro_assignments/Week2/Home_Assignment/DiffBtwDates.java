import java.time.LocalDate;  
import java.time.format.DateTimeFormatter;
import java.time.Period;  
import java.util.Scanner; 
class DiffBtwDates{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Date1 in dd-MM-yyyy format:");
    String Date1 = sc.next();
    System.out.println("Enter the Date2 in dd-MM-yyyy format:");
    String Date2 = sc.next();
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate d1=  LocalDate.parse(Date1,dateFormat);
    LocalDate d2=  LocalDate.parse(Date2,dateFormat);
    Period period = Period.between(d1,d2);  
    System.out.println("Years="+period.getYears()+"\n Months="+period.getMonths()+"\nDays="+period.getDays());
  }
}
