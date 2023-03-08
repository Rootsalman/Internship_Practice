 // Create a class called "Rectangle" with attributes like "length" and "width". Include methods that calculate the area and perimeter of the rectangle.
import java.util.*;
class Rec{
  double length,breath,Area,Peri;

  void read(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lenght");
    length = sc.nextDouble();
    System.out.println("Enter the breath");
    breath = sc.nextDouble();
  }
  void calculate(){
    Area = length*breath;
    Peri=2*(length+breath);
  }

  void display(){
    System.out.println("Area of rectangle is :" +Area);
    System.out.println("Perimeter of the rectangle is :" +Peri);
  }
}

  public class ObjectClassRecatangle{
    public static void main(String args[]){
       Rec str = new Rec();
      str.read();
      str.calculate();
      str.display();
    }
  }