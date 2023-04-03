class Student{
  public void read(){
    System.out.println("the book name is oops");
  }
  public void read(String name){
    System.out.println("The book name is"+name);
  }
  public void read(int No_of_copies){
    System.out.println("The number of copies are :" +No_of_copies);
  }
 public  class PolyMorphism{
    public static void main(String args[]){
      Student read = new Student();
     Student.read();
     Student.read("opps");
     Student.read(10);
    }
  }
}