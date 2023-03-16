// 2. Shapes: Create classes for different shapes (e.g. Circle, Rectangle, Triangle) that all extend a base Shape class. Each class should have methods to calculate the area and perimeter of the shape. You can also create a custom exception called InvalidDimensionsException to throw when the dimensions of a shape are invalid.
class InvalidDimensionsException extends Exception{
  InvalidDimensionsException(String str){
    super(str);
    
  }
}
 
class Rectangle{
  
  void area(double length,double breath) throws InvalidDimensionsException{
    if(length<=0 && breath<=0){
      throw new InvalidDimensionsException("OHHH!! its an invalid dimension");
    } 
    else{
      double Area=length*breath;
      System.out.println("Area of rectangle is :"+Area);
    }
    }
  void perimeter(double length,double breath) throws InvalidDimensionsException{
    int balance=50000;
    if(length<=0 && breath<=0){
      throw new InvalidDimensionsException("OHHH!! its an invalid dimension");
    } 
    else{
      double peri=2*(length+breath);
    System.out.println("Perimeter of rectangle is :"+peri);
    }
    }
  }
class Circle{
  
  void area(double radius) throws InvalidDimensionsException{
    if(radius<=0){
      throw new InvalidDimensionsException("OHHH!! its an invalid dimension");
    } 
    else{
      double Area=3.142*radius*radius;
      System.out.println("Area of Circle is :"+Area);
    }
    }
  void perimeter(double radius) throws InvalidDimensionsException{
    if(radius<=0){
      throw new InvalidDimensionsException("OHHH!! its an invalid dimension");
    } 
    else{
      double peri=2*3.142*radius;
    System.out.println("Perimeter of rectangle is :"+peri);
    }
    }
  }
class Triangle{
  
  void area(double height,double base) throws InvalidDimensionsException{
    if(height<=0 && base<=0){
      throw new InvalidDimensionsException("OHHH!! its an invalid dimension");
    } 
    else{
      double Area=(height*base)/2;
      System.out.println("Area of Triangle is :"+Area);
    }
    }
  void perimeter(double a,double b, double c) throws InvalidDimensionsException{
    if(a<=0 && b<=0 && c<=0){
      throw new InvalidDimensionsException("OHHH!! its an invalid dimension");
    } 
    else{
      double peri=a+b+c;
    System.out.println("Perimeter of rectangle is :"+peri);
    }
    }
  }
 
class ExceptionShape{
public static void main(String args[]){
Rectangle Rec=new Rectangle();
 Circle crc = new Circle(); 
  Triangle tri = new Triangle();
  try{
   Rec.area(10, 20);
    Rec.perimeter(10, 20);
  }
  catch(InvalidDimensionsException e){
    System.out.println(e);
  }
  try{
    crc.area(5);
    crc.perimeter(4);
  }
  catch(InvalidDimensionsException a){
    System.out.println(a);
  }
  try{
    tri.area(20,10);
    tri.perimeter(2,4,7);
  }
  catch(InvalidDimensionsException b){
    System.out.println(b);
  }
}
}
 