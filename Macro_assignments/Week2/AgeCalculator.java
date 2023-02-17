import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
class AgeCalculator{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String Birthdate;
      System.out.println("Enter your DOB in YYYY-MM-DD format");
      Birthdate = sc.next();
    LocalDate today = LocalDate.now();
    System.out.println(today);
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate Dateofbirth = LocalDate.parse(Birthdate, dateFormat);
    Period Age=Period.between(Dateofbirth,today);
    System.out.println(Age.getYears());
    if(Age.getYears()>=18){
      System.out.println("Adult");
    }
    else{
      System.out.println("The person is minor");
    }
    
  }
}
