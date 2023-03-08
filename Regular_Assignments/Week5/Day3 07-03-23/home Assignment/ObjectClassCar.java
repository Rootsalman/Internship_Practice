  // Create a class called "Car" with attributes like "make", "model", "year", and "color". Include a method that prints out the car's attributes.
import java.util.*;
class Car{
  String name;
  String Company;
  int year;
  String color;

void read(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter name of car");
  name = sc.nextLine();
  System.out.println("Enter Company of car");
  Company = sc.nextLine();
  System.out.println("Enter year of car");
  year = sc.nextInt();
  System.out.println("Enter color of car");
  color = sc.next(); 
}
  void display() {
    System.out.println("Name :" +name);
    System.out.println("Comapany :" +Company);
    System.out.println("Year :"+year);
    System.out.println("Color :" +color);
}
}
  public class ObjectClassCar{
     public static void main(String args[]) {
    Car s1 = new Car();
    s1.read();
       s1.display();
      
  }
}