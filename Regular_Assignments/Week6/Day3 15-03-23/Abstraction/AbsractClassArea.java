// Write an abstract class "Shape" which has a method "calculateArea()" which returns the area of the shape. Write two subclasses "Circle" and "Rectangle" which implement the method "calculateArea()" for their respective shapes.
abstract class Shape{
  abstract double calculateArea();
}
class Circle extends Shape{
  double calculateArea(){
    int r=2;
    double area= 2 * 3.142*r;
    return area;
  }
}
class Recatangel extends Shape{
  double calculateArea(){
     double l=10,b=20;
  double area = l*b;
  return area;
  }
}
public class AbsractClassArea{
  public static void main(String args[]){
    Shape circ = new Circle();
    Shape rec = new Recatangel();
    System.out.println("area of circle is " +circ.calculateArea());
    System.out.println("Area of rectangle is "+rec.calculateArea());
  }
}