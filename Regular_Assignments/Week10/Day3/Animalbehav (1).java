 class Animal{
   String color;
  int noofLegs;

 class Dog extends Animal{
  public void bark(){
    System.out.println("bowwww");
  }
}
 class BabyDog extends Dog{
  public void bark(){
    System.out.println("weeee!!!");
  }
}
 class Cat extends Animal{
   public void meow() {
        System.out.println(" meow");
  }
}
 }
public class Animalbehav{
    public static void main(String[] args) {
        Dog dd = new Dog();
        dd.bark();
        BabyDog bdog = new BabyDog();
        bdog.bark();
        Cat c = new Cat();
        c.meow();
    }
}
