interface Shape{
  void show();
}
class Rectangle implements Shape{
  public void show(){
    System.out.println("Rectangle");
  }
}
class Circle implements Shape{
  public void show(){
    System.out.println("Circle");
  }
}
class Square implements Shape{
  public void show(){
    System.out.println("Square");
  }
}
 
class InterfaceDemo{
  public static void main(String args[]){
    Shape s=new Rectangle();
    Shape s1=new Circle();
    Shape s2=new Square();
    s.show();
    s1.show();
    s2.show();
  }
}