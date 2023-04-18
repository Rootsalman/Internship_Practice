public class Employee{
  private String name;
  private int age;
  private double salary;

  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setSalary(double salary){
    this.salary = salary;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public double getSalary(){
    return salary;
  }

 public String toString(){
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
public static void main(String args[]){
  Employee emp = new Employee();
   emp.setName("Ronaldo");
  emp.setAge(42);
  emp.setSalary(5000.00);
  System.out.println(emp);
}
}