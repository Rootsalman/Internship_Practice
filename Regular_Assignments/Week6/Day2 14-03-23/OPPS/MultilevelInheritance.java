class Animal{
  String name;
  String color;
  void walk(){
    System.out.println("the dog is walking");
    System.out.println("name"+" " +name+" "+"color"+" " +color);
  }
}

class dog extends Animal{
  String legs;
  void bark(){
    System.out.println("the dog is barking");
  }
}

class BabyDog extends dog{
  int age;
  void sleep(){
    System.out.println("the dog is sleeping");
  }
}
class MultilevelInheritance{
  public static void main(String args[]){
    BabyDog bd = new BabyDog();
    bd.name="germanshep";
    bd.color="black";
    bd.legs="5";
    bd.age=10;
    bd.walk();
    bd.bark();
    bd.sleep();
  }
}