// Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.
class Shape{
  double getArea(){
    return 0.0;
  }
}
class Circle extends Shape{
  double getArea(){
    int r =5;
    double area = (3.142)*r*r;
     return area;
  }
}
class rectangle extends Shape{
  double getArea(){
    double l=9,b=10;
    double area = l*b;
    return area;
  
  }
}
class PolymorphismShape{
  public static void main(String args[]){
    Circle crc = new Circle();
    rectangle rc = new rectangle();
    System.out.println("the area of circle is :" +crc.getArea());
     System.out.println("the area of rectangle is :" +rc.getArea());
    crc.getArea();
    rc.getArea();
  }
}